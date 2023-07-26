import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Rough{
    public static void main(String[] args) {
        

       ArrayList<Integer> Arr = new ArrayList<Integer>();
       for(int i=1;i<=10;i++){
        Arr.add(i*10);
       }
       System.out.println("Arr = "+Arr);
       for(int i=0; i<Arr.size()/2;i++){
            int temp = Arr.get(i);
            Arr.set(i,Arr.get(Arr.size()-i-1));
            Arr.set(Arr.size()-i-1,temp);
       }
       System.out.println("Arr = "+Arr);
        
       
    }
}