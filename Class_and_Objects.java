
import java.util.*;




public class Class_and_Objects {
    public static void main(String[] args){
        Square s = new Square(10,20);

    }
}



class Square{

    private int length,breadth;
    
    public Square(int len, int bre){
        System.out.println("Constructor Executed!");
    }   
    
    
    public void area(){
        System.out.println("Area = "+length*breadth);
    }
    
    public void perimeter(){
        System.out.println("Perimeter = "+2*(length+breadth));
    }
    static{
        System.out.println("Static Block Executed!");
    }
}








