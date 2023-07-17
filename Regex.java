
import java.util.regex.*;


public class Regex {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("[ABC]\\w+");
        String IPAddress = "123.22.11.44";
        Matcher m = p.matcher(IPAddress);
        if(m.matches()){
            System.out.println("It is Valid IP Address");
        } else {
            System.out.println("It is not a valid IP Address...");
        }
        
    }   
}