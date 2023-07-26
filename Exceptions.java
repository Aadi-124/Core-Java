import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {

        try {
            // int a = 100;
            // int b = 0;
            // int c = a / b;
            // int[] arr = new int[-2];
            // Sample s = null;
            // s.msg();
            try{
                Sample s = null;
                // s.msg();
            } finally{
                System.out.println("HI");
            }
            // if this catch block is unable to handle the exception then the outer catch block that matches this exception will get executed!
        } catch (ArithmeticException E) {
            System.out.println("Arithemetic Error!");
            System.out.println(E);
        } catch (NegativeArraySizeException E) {
            System.out.println("RANDOM ERROR!");
            System.out.println(E);
        } finally{
            System.out.println("This block executed regardless of wheather the error handeled or not!");
        }

// IMP NOTE --> If we specify the finally block then we can eleminate the catch blocks!
// Following block of code will successfully executes without throwing an error.
            try{
                System.out.println("ASD");
            } finally{
                System.out.println("THIsa");
            }


        // Throwing built exception at user defined condition!
        int age = 12;
        if(age < 18){
                throw new ArithmeticException("Age must be above 18!");
        } 
        int age2 = 12;
        if(age2 < 18){
                throw new UserDefinedException("Age must be above 18!");
        } 
            Sample s = new Sample();
            s.msg3();

        


    }


}

// Creating user defined exception
// here we are extending class from RuntimeExceptionthat's why we can successfully compile this code 
// if we extend it form the Exception class then it will throw error at compile and we unable to compile it.
// because Exception class contains checked exception which is checket at compile time
// and RuntimeException contains unchecked exceptions which are checked at runtime only!.
class UserDefinedException extends RuntimeException{

    public UserDefinedException(String str){
        super(str);
        System.out.println("This is the user defined exception!");
    }
}





class Sample {
//In case we declare the exception and the exception occurs, it will be thrown at runtime because throws does not handle the exception.

    public void msg() throws ClassNotFoundException{
        System.out.println("Error:-");
        // int a = 10/0;.
        // throw new Error("Error Occured!");
    }
    public void msg1(){
        try{msg();}catch(Exception E){}
    }

    public void msg2(){
        try{
            msg1();
        } catch (Exception E){
            System.out.println("Handled in msg2()");
        }
    }

    public void msg3(){
        try{
            msg2();
        }catch(Exception E){
            System.out.println("Handled in msg3()");
        }
    }

}


class Child extends Sample{
    public void cmsg()throws Exception{
        System.out.println("cmsg()");
    }

    // This will throw error:-
    // @Override
    // public void msg()throws IOException{

    // }


    @Override
    public void msg()throws ClassNotFoundException{
        System.out.println("ERHHWEIDS");
    }   



}
