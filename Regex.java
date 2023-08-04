
import java.util.regex.*;


public class Regex {
    public static void main(String[] args) {

        Pattern P = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
        Matcher M = P.matcher("I love Love to To tO code");
        System.out.println(M.find());
        
        
    }   
}