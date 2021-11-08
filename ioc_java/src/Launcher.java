import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.*;

public class Launcher {
    public static void main(String[] args) throws Exception {
//        generateProxyClass();
//        staticProxy();
//        dynamicProxy();
        reflectDemo();
    }

    /**
     * 反射复习
     */
    private static void reflectDemo() throws Exception {
        // 获取字节码
        Class<?> clazz = Class.forName("Person");

        // 获取构造函数，并实例化对象
        Constructor<?> constructor = clazz.getConstructor(String.class);
        Object person = constructor.newInstance("WangTao");
        System.out.println("---> " + person);

        // 获取私有字段
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        Object name = nameField.get(person);
        System.out.println("---> " + name);

        // 调用私有方法
        Method sayMethod = clazz.getDeclaredMethod("say", String.class);
        sayMethod.setAccessible(true);
        sayMethod.invoke(person, "大家好～");
    }

    /**
     * 动态代理
     */
    private static void dynamicProxy() {
        Hello hello = new Hello();
        HelloInterface proxy = (HelloInterface) Proxy.newProxyInstance(
                // ClassLoader loader
                hello.getClass().getClassLoader(),
                // Class<?>[] interfaces
                hello.getClass().getInterfaces(),
                // InvocationHandler h
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before invoke " + method.getName());
                        Object o = method.invoke(hello, args);
                        System.out.println("after invoke " + method.getName());
                        return o;
                    }
                });
        proxy.sayHello();
    }

    /**
     * 静态代理
     */
    private static void staticProxy() {
        HelloProxy proxy = new HelloProxy();
        proxy.sayHello();
    }

    /**
     * 生成代理类 class
     */
    private static void generateProxyClass() throws Exception {
        // 生成一个 class 二进制文件
        byte[] bytes = ProxyGenerator.generateProxyClass("HelloImpl", new Class<?>[]{HelloInterface.class});

        String rootPath = new File("").getAbsolutePath();
        File file = new File(rootPath, "/HelloImpl.class");

        // 输出二进制文件
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
    }

}
