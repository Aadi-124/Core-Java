import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sample{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       ArrayList<Integer> Arr = new ArrayList<Integer>();
       for(int i=0;i<N;i++){
           Arr.add(sc.nextInt());
       }
       int nq = sc.nextInt();
       for(int i=0; i<nq;i++){
           String query = sc.nextLine();
           sc.nextLine();
           if(query.equals("Insert")){
               int in = sc.nextInt();
               int val = sc.nextInt();
               Arr.add(in,val);
           }
           if(query.equals("delete")){
               int in = sc.nextInt();
               Arr.remove(in);
           }
       }
       for(int x:Arr){
           System.out.print(x+" ");
       }
    }
}