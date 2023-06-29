
import java.util.*;
import java.text.NumberFormat;

public class Rough{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Currency : ");
        double amount = sc.nextDouble();
        NumberFormat f;  
    

        f = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(f.format(amount));
        f = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(f.format(amount));
       
    
    }
}