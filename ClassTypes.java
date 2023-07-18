import java.util.*;

public class ClassTypes{
    public static void main(String[] args) {
        
        // It is not possible:-
        // AbstractClass ac = new AbstractClass();
        

        System.out.println("Inner class:-");
        Outer_Class OC = new Outer_Class();

        // This is how we can create an object of non static inner class:-
        Outer_Class.Inner_Class IN = OC.new Inner_Class();
        IN.inmsg();

        Outer_Class.Static_Inner_Class SIC = new Outer_Class.Static_Inner_Class();
        


        // Anonymous Inner Class
        AbstractClass AC = new AbstractClass() {
            @Override
            public void add(int a, int b){
                System.out.println("Aaddition = "+(int)(a+b));
            }
        };   

        AC.add(10,20);

    }
}

// if any class contains abstract method then it becomes an abstract class.
abstract class AbstractClass {

    abstract public void add(int a, int b);
    public AbstractClass() {
        System.out.println("ASD");
    }
    public void msg(){
        System.out.println("Hell");
    }
}



// If derived class doesn't contain any abstract method then it is called concrete class!
class ConcreteClass extends AbstractClass {
    @Override
    public void add(int a, int b){
        System.out.println("Addition = "+a+b);
    }
}


// POJO classes:-
/*
 * contains only private data members
 * contains public getter and setter methods for the private data members.
 * not contains constructors
 * must not inherit from any class or interface
 * POJO -> Plain Old Java Object.
 * 
 */
class POJO_Class {

    private String name = "data_member1";
    private int age = 23;

    public void setName(String n){
        name = n;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}



// Inner class 
class Outer_Class {

    private String msg = "Hello World";
    public void msg(){
        System.out.println(msg);
    }

    class Inner_Class{
        public void inmsg(){
            System.out.println("inmsg = "+msg);
        }
    }


    static class Static_Inner_Class{
        public Static_Inner_Class(){
            System.out.println("Static inner class Object is created!");
        }
    }

}


// Final classes cannot be derived and no class can be derived from final class
// in short it retricts the inheritance.
final class Final_Class{
    public Final_Class(){
        System.out.println("Hello World");
    }
}




