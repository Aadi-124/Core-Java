import java.util.*;

public class JavaHashset {
    public static void main(String[] args){

        HashSet<Integer> hashset = new HashSet<>();
        for(int i=1;i<=5;i++){
            hashset.add(i*10);
        }
        System.out.println("hashset = "+hashset);
        System.out.println("hashset.add(300) = "+hashset.add(300)+". hashset = "+hashset);
        System.out.println("hashset.contains(50) = "+hashset.contains(50));
        System.out.println("hashset.size() = "+hashset.size());
        System.out.println("hashset.isEmpty() = "+hashset.isEmpty());
        System.out.println("hashset");
        HashSet<String> hash = new HashSet<String>();
        Iterator I = hashset.iterator();
        while(I.hasNext()){
            System.out.print(I.next());
        }
        
    }
}
