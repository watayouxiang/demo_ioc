public class HelloProxy implements HelloInterface {
    private final HelloInterface helloInterface = new Hello();

    @Override
    public void sayHello() {
        System.out.println("before hello ~");
        helloInterface.sayHello();
        System.out.println("after hello ~");
    }
}
