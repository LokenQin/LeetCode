public class Hello {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}
class A{
    static {
        System.out.println("1");
    }
    static {
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
    public A(){
        System.out.println("a");
    }
}
class B extends A{
    static {
        System.out.println("5");
    }
    static {
        System.out.println("6");
    }
    {
        System.out.println("7");
    }
    public B(){
        System.out.println("b");
    }
}