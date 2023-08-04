import java.util.*;

class JavaList {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<5;i++){
            list.add(i);
        }   
        System.out.println("list = "+list);
        System.out.println("list.add(4) = "+list.add(4)+". list = "+list);
        list.add(3,33);
        System.out.println("list = "+list);

        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println("list2 = "+list2);
        
        System.out.println("list.addAll(list2) = "+list.addAll(list2)+". list = "+list);
        System.out.println("list.addAll(4,list2) = "+list.addAll(4,list2)+". list = "+list);
        System.out.println("list.equals(20) = "+list.equals(20));
        System.out.println("list.isEmpty() = "+list.isEmpty());
        System.out.println("list.lastIndexOf(4444) = "+list.lastIndexOf(4444));
        System.out.println("list.lastIndexOf(10) = "+list.lastIndexOf(10));
        System.out.println("list.contains(100) = "+list.contains(100)+" List = "+list);
        System.out.println("list.contains(4) = "+list.contains(4)+" List = "+list);
        System.out.println("list.remove(4) = "+list.remove(4)+". List = "+list);
    }
}




