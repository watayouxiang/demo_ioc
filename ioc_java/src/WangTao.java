import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;

public class WangTao {
    public static void main(String[] args) throws Exception {
        demo();

    }

    /**
     * 生成代理类 class
     */
    private static void demo() throws Exception {
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
