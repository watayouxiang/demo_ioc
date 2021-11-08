package com.watayouxiang.demo.annotation;

import android.view.View;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/08
 *     desc   :
 * </pre>
 */
public class InjectManager {
    public static void inject(Object obj) {
        // 布局注入
        injectLayout(obj);
        // 控件注入
        injectViews(obj);
        // 事件注入
        injectEvent(obj);
    }

    private static void injectEvent(final Object obj) {
        Class<?> clazz = obj.getClass();

        // 获取类中的所有方法
        Method[] methods = clazz.getDeclaredMethods();
        for (final Method method : methods) {

            // 获取方法中的所有注解如：@OnClick, @OnLongClick, @Override...
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {

                // 只获取 @InjectEvent 类型的注解
                Class<? extends Annotation> annotationType = annotation.annotationType();
                InjectEvent injectEvent = annotationType.getAnnotation(InjectEvent.class);
                if (injectEvent == null) continue;

                // 获取 @InjectEvent 注解的事件三要素
                String listenerSetter = injectEvent.listenerSetter();// "setOnClickListener"
                Class<?> listenerType = injectEvent.listenerType();// View.onClickListener.class
                String callbackMethod = injectEvent.callbackMethod();// "onClick"

                // --------------------------------------------------------
                try {
                    // 获取 @InjectEvent 注解的 value 方法
                    // 通过调用该方法，从而拿到 viewIds
                    Method valueMethod = annotationType.getDeclaredMethod("value");
                    int[] viewIds = (int[]) valueMethod.invoke(annotation);
                    if (viewIds == null) continue;

                    for (int id : viewIds) {
                        // 通过 View view = findViewById(R.id.my_view) 方法，拿到 view 对象
                        Method findViewById = clazz.getMethod("findViewById", int.class);
                        View view = (View) findViewById.invoke(obj, id);
                        if (view == null) continue;

                        // 拿到 View 的 setOnClickListener(View.onClickListener l) 方法
                        Method setterMethod = view.getClass().getMethod(listenerSetter, listenerType);
                        // 动态代理
                        Object proxy = Proxy.newProxyInstance(
                                // ClassLoader loader
                                listenerType.getClassLoader(),
                                // Class<?>[] interfaces
                                new Class[]{listenerType},
                                // InvocationHandler h
                                new InvocationHandler() {
                                    @Override
                                    public Object invoke(Object _proxy, Method _method, Object[] args)
                                            throws Throwable {
                                        return method.invoke(obj, args);
                                    }
                                }
                        );
                        // 调用 View 的 setOnClickListener(View.onClickListener l) 方法
                        setterMethod.invoke(view, proxy);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // --------------------------------------------------------

            }
        }
    }

    private static void injectViews(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            InjectView injectView = field.getAnnotation(InjectView.class);
            if (injectView != null) {
                try {
                    // TextView textView = findViewById(R.id.text);
                    Method method = clazz.getMethod("findViewById", int.class);
                    int viewId = injectView.value();
                    View view = (View) method.invoke(obj, viewId);
                    field.setAccessible(true);
                    field.set(obj, view);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void injectLayout(Object obj) {
        Class<?> clazz = obj.getClass();
        InjectLayout injectLayout = clazz.getAnnotation(InjectLayout.class);
        if (injectLayout != null) {
            // setContentView(R.layout.activity_main);
            try {
                Method method = clazz.getMethod("setContentView", int.class);
                int value = injectLayout.value();
                method.invoke(obj, value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
