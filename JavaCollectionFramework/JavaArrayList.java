package JavaCollectionFramework;
import java.util.*;

public class JavaArrayList {
    
    public static void main(String[] args){

        ArrayList<Integer> Arr = new ArrayList<Integer>();
        
        for(int i=1;i<=10;i++){
            Arr.add(i*10);
        }

        ArrayList<Integer> Arr2 = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            Arr2.add(i*11);
        }

        System.out.println("Arr = "+Arr);
        System.out.println("Arr2 = "+Arr2);
        Arr.add(5,5000);
        System.out.println("Arr.add(5,5000) = "+Arr);
        Arr.addAll(Arr2);
        System.out.println("Arr = "+Arr);
        System.out.println("Arr.size() = "+Arr.size());
        System.out.println("Arr.lastIndexOf(5000) = "+Arr.lastIndexOf(5000));
        System.out.println("Arr.contains(100) = "+Arr.contains(100));
        System.out.println("Arr.contains(200) = "+Arr.contains(200));
        System.out.println("Arr.remove(5) = "+Arr.remove(5));
        System.out.println("Arr = "+Arr);
        System.out.println("Arr.removeAll(Arr2) = "+Arr.removeAll(Arr2));
        System.out.println("Arr = "+Arr);
        System.out.println("Arr.set(4,8) = "+Arr.set(4,8));
        System.out.println("Arr = "+Arr);
        Collections.sort(Arr);
        System.out.println("Arr.sort() = "+Arr);
      
        Iterator itr = Arr.iterator();
        System.out.println("Iteration using iterator:- ");
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        System.out.println("Iteration using for each loop:-");
        for (Integer integer : Arr) {
            System.out.print(" "+integer);
        }
        System.out.println();

        System.out.println("Arr.size() = "+Arr.size());
        Collections.reverse(Arr);
        System.out.println(Arr);
        System.out.println();

    }   

}
