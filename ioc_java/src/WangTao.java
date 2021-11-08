import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WangTao {
    public static void main(String[] args) throws Exception {
//        generateProxyClass();
//        staticProxy();
        dynamicProxy();
    }

    /**
     * 动态代理
     */
    private static void dynamicProxy() {
        HelloImpl hello = new HelloImpl();
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

    public static class HelloProxy implements HelloInterface {
        private final HelloInterface helloInterface = new HelloImpl();

        @Override
        public void sayHello() {
            System.out.println("before hello ~");
            helloInterface.sayHello();
            System.out.println("after hello ~");
        }
    }

    public static class HelloImpl implements HelloInterface {
        @Override
        public void sayHello() {
            System.out.println("hello ~");
        }
    }

    public interface HelloInterface {
        void sayHello();
    }

}
