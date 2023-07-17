public class Final {
    
    public static void main(String[] args){

            final int a = 10;
            System.out.println(a);

            // a = 20;        // This is not permitted!


            Base B = new Base();
            B.msg();

            Derived D = new Derived();
    }
}


class Base {

    Integer a = 10;

    public final void msg(){
        System.out.println("This is the msg() method! from Base class ");
    }

}



class Derived extends Base {

    // This is not permitted!
    // @Override
    // public final void msg(){
    //     System.out.println("This is overrided Method!");
    // }
    public Derived(){
        System.out.println("Derived class is created!");
    }
}

final class Base1 {

    public Base1(){
        System.out.println("Base1 is created!");
    }

}

class Derived2 extends Base1 {

    public Derived2(){
        System.out.println("Derived2!");
    }

}


