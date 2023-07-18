public abstract class Interfaces {
    public static void main(String[] args) {
        A a = new C1();
        a.msg();
    }
}

interface A{

    // This throws an error.
    // public A(){

    // }

    final int MAX_NUM = 10;
    abstract public void msg();
}

class C1 implements A{
    @Override
    public void msg(){
        System.out.println("Overrided msg()");
    }
} 