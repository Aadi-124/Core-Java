import java.util.*;


public class JavaLinkedList {
    public static void main(String[] args) {

        

        LinkedList<Integer> ll = new LinkedList<Integer>();  
        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        ll2.add(9999);
        ll2.add(7777);
        ll2.add(8888);
        System.out.println("ll = "+ll);
        for(int i=0;i<10;i++){
            ll.add(i*10);
        }    
        System.out.println(ll);
        System.out.println("ll.add(500) = "+ll.add(500)+". ll = "+ll);
        ll.add(2,4444);
        System.out.println("ll.add(2,4444) = "+ll);
        ll.addAll(5,ll2);
        System.out.println("ll.addAll(5,ll2) = "+ll);
        ll.addFirst(1010);
        System.out.println("ll.addFirst(1010) = "+ll);
        ll.addLast(2020);
        System.out.println("ll.addLast(2020) = "+ll);
        Object ll3 = ll.clone();
        System.out.println("(Object)ll3 = "+ll3);
        System.out.println("ll.get(4) = "+ll.get(4));
        System.out.println("ll.getFirst() = "+ll.getFirst());
        System.out.println("ll.getLast() = "+ll.getLast());
        System.out.println("ll.indexOf(400) = "+ll.indexOf(400));
        System.out.println("ll.indexOf(400) = "+ll.indexOf(4444));
        System.out.println("ll.lastIndexOf(8888) = "+ll.lastIndexOf(8888));
        System.out.println("ll.peek() = "+ll.peek());
        System.out.println("ll.peekFirst() = "+ll.peekFirst());
        System.out.println("ll.peekLast() = "+ll.peekLast());
        System.out.println("ll.poll() = "+ll.poll()+". ll = "+ll);
        System.out.println("ll.pollFirst() = "+ll.pollFirst()+". ll = "+ll);
        System.out.println("ll.pollLast() = "+ll.pollLast()+". ll = "+ll);
        System.out.println("ll.pop() = "+ll.pop()+". ll = "+ll);
        ll.push(8181);
        System.out.println("ll.push(8181) = "+ll);
        System.out.println("ll.remove(4) = "+ll.remove(4)+". ll = "+ll);
        System.out.println("ll.removeFirst() = "+ ll.removeFirst()+". ll = "+ll);
        System.out.println("ll.remove((Object)8888) = "+ll.remove((Object)8888)+". ll = "+ll);
        System.out.println("ll.removeFirstOccurrence(7777) = "+ll.removeFirstOccurrence(7777)+". ll = "+ll);
        ll.add(4040);
        ll.add(4,4040);
        ll.add(3003);
        System.out.println("ll = "+ll);
        System.out.println("ll.removeLast() = "+ll.removeLast()+". ll = "+ll);
        System.out.println("ll.removeLastOccurrence((Object)5555) = "+ll.removeLastOccurrence((Object)5555)+". ll = "+ll);
        System.out.println("ll.set(4,0000) = "+ll.set(4,00)+". ll = "+ll);
        Object[] obj = ll.toArray();
        System.out.println("Obj Array: -");
        for(int i=0;i<obj.length;i++){
            System.out.print(obj[i]+" ");
        }
        System.out.println();
        System.out.println("ll.size() = "+ll.size());
        
    }   
}










