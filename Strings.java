import java.util.Arrays;

public class Strings {
    public static void main(String[] args){
        
        System.out.println("String Constructirs:- ");
        
        String s1 = new String();
        
        byte[] barr = {65,66,67,68,69,70};
        String s2 = new String(barr);
        
        char[] carr = {'A','a','d','i','t','y','a'};
        String s3 = new String(carr);
        
        String s4 = new String("Thakare");
        
        StringBuffer sb = new StringBuffer("StringBuffer Object is Here!");
        String s5 = new String(sb);
        
        String s6 = new String(barr,1,4);

        System.out.println("String s1 = new String() = "+s1);
        System.out.println("String s2 = new String(barr) = "+s2);
        System.out.println("String s3 = new String(carr) = "+s3);
        System.out.println("String s4 = new String(\"Thakare\") = "+s4);
        System.out.println("String s5 = new String(sb) = "+s5);
        System.out.println("String s6 = new String(barr,1,4) = "+s6);
        
        
        System.out.println("\n\nString Methods:-");
        
        String string = "Aaditya Thakare";
        
        System.out.println("string = "+string);
        System.out.println("string.length() = "+string.length());
        System.out.println("string.concat(\" Patil\") = "+string.concat(" Patil"));
        System.out.println("string.charAt(3) = "+string.charAt(3));
        System.out.println("string.equals(\"Thakare\") = "+string.equals("Thakare"));
        System.out.println("string.equals(\"Aaditya Thakare\") = "+string.equals("Aaditya Thakare"));
        System.out.println("string.equalsIgnoreCase(\"aaditya thakare\") = "+string.equalsIgnoreCase("aaditya thakare"));
        System.out.println("string.equals(\"aaditya thakare\") = "+string.equals("aaditya thakare"));
        System.out.println("string.compareTo(\"Aaditya Thakare\") = "+string.compareTo("Aaditya Thakare"));
        System.out.println("string.compareTo(\"Aaditya Thakarf\") = "+string.compareTo("Aaditya Thakarf"));
        System.out.println("Arrays.toString(string.getBytes()) = "+Arrays.toString(string.getBytes()));
        System.out.println("Arrays.toString(string.toCharArray()) = "+Arrays.toString(string.toCharArray()));
        System.out.println("string.isEmpty() = "+string.isEmpty());
        System.out.println("string.replace('a','@') = "+string.replace('a','@'));
        System.out.println("\"That is whats is it is.\".replaceAll(\"is\",\"this\") = "+"That is whats is it is".replaceAll("is","this"));
        System.out.println("Array.toString(string.split(\"a\")) = "+Arrays.toString(string.split("a")));
        System.out.println("string.substring(\"4\") = "+string.substring(4));
        System.out.println("string.substring(8,13) = "+string.substring(8,13));
        System.out.println("string.toLowerCase() = "+string.toLowerCase());
        System.out.println("string.toUpperCase() = "+string.toUpperCase());
        System.out.println("string.trim() = "+string.trim());
        System.out.println("string.startsWith(\"Aa\") = "+string.startsWith("Aa"));
        System.out.println("string.endsWith(\"re\") = "+string.endsWith("re"));
        System.out.println("string.indexOf('a') = "+string.indexOf('a'));
        System.out.println("string.indexOf('a',4) = "+string.indexOf('a',4));
        System.out.println("string.lastIndexOf('a') = "+string.lastIndexOf('a'));
        System.out.println("string.lastIndexOf('x') = "+string.lastIndexOf('x'));      
    }
}







