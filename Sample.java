
import java.util.*;
import java.util.regex.*;
public class Sample{
    public static void main(String[] args){
        
        LinkedList<Integer> ll = new LinkedList();
        for(int i=0;i<10;i++){
            ll.add(i);
        }
        ListIterator<Integer> list;
        list = ll.listIterator();
        System.out.println(list.hasNext());
        System.out.println(list.next());
        System.out.println(list.previousIndex());
        System.out.println(list.previousIndex());
    }   
    
}
