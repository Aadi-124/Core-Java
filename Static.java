// // program for static variable:-
// import java.util.*;


// class Static {
//     public static void main(String[] args){
//        Test t1 = new Test();
//        Test t2 = new Test();
//        t2.display();
//        t1.display();
//        Test t3 = new Test();
//        t2.display();
//        t1.display();
//        t3.display();
//     }
// }


// class Test {
    
//     static int counter = 0;

//     public Test(){
//         counter++;
//     }

//     public void display(){
//         System.out.println(counter);
//     }

// }


// Static methods:-

class Static{
    public static void main(String[] args) {
        // Sample.msg();
        Sample s = new Sample();
        Sample.Innerclass in = new Sample.Innerclass();
    }
}
class Sample{


    static class Innerclass {

        public Innerclass(){
            System.out.println("Innerclass Constructor!");
        }

    }


    static {
        System.out.println("Static Block is called!");
    }

    public Sample(){
        System.out.println("Sample Constructor is called!");
    }

    
    static int a = 10;

    public static void msg(){
        System.out.println("HI");
        System.out.println(a);
        a++;

    }
}

// This is not valid!: -
/* 

static class Sample2 {

}

*/
