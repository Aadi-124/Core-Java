import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Rough{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pattern P = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*()-+]).{8,30}");
        int n = sc.nextInt();
        sc.skip("\\r\\n");
        while(n>0){
            String name = sc.nextLine();
            Matcher M =P.matcher(name);
            if(M.matches()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            
            n--;
        }
        
        
       
    }
}