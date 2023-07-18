
import java.util.*;

public class Polymorphism {

    public static void main(String[] args) {

        Base B = new Derived();
        B.method1();
        B.method2();
        Base.staticMethod();
        Derived.staticMethod();
        

        Derived D = new Derived();
        if(D instanceof Base) {
            System.out.println("YEESSSSSSSSS!");
        }

    }
}    




class Base{


    public void method1(){
        System.out.println("Base class : method1()");
    }



    public void method2(){
        System.out.println("Base class : method2()");
    }


    public static void staticMethod(){
        System.out.println("Static method : Base");
    }

}


class Derived extends Base {

    @Override
    public void method1(){
        System.out.println("Overrrided by Derived class.");
    }

    public void method3(){
        System.out.println("Derived class : method3()");
    }

    public static void staticMethod(){
        System.out.println("Derived:static in Derived class");
    }
}






