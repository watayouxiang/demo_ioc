package com.watayouxiang.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/08
 *     desc   :
 * </pre>
 */
// 标记这个注解应该是哪种 Java 成员
@Target(ElementType.ANNOTATION_TYPE)
// 标识这个注解怎么保存，是只在代码中，还是编入class文件中，或者是在运行时可以通过反射访问
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectEvent {
    //事件三要素
    //1、setOnClickListener
    //2、View.onClickListener
    //3、onClick
    String listenerSetter();
    Class<?> listenerType();
    String callbackMethod();
}
