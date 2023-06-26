import java.util.*;

public class Ternary_Operator {
    public static void main(String[] args){
        
        // Finding Greatest of Three
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number : ");
        int num3 = sc.nextInt();
        System.out.println("Enter 4th Number : ");
        int num4 = sc.nextInt();
        int x,y;
        int g = (x = num1 > num2 ? num1:num2) > (y = num3 > num4 ? num3:num4) ? x:y;
        System.out.println("Greater = "+g);


    }
}
