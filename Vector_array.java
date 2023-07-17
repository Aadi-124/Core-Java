import java.util.Vector;

public class Vector_array {
    public static void main(String[] args){

        // Vector<Integer> a = new Vector<Integer>(10);
        // for(int i=0; i<10; i++){
        //     a.add(i);
        // }

        // System.out.println(a);
        // System.out.println("Capacity = "+a.capacity());
        // System.out.println("Capacity = "+a.capacity());
        // a.add(11);
        
        // if(a.add(1000)){
        //     System.out.println("1000 added Successfully!");
        // }
        // // a.removeAllElements();
        // // a.clear();
        // if(a.isEmpty()){
        //     System.out.println("Vector is Empty!");
        // }
        // a.add(200);
        // if(a.contains(200)){
        //     System.out.println("Vector contains 200!");
        // }
        // else{
        //     System.out.println("not contain 200!");
        // }

        // System.out.println(a);
        // System.out.println(a.get(10));
        // // System.out.println(a.set(10,11111));
        // a.setElementAt(111111,10);
        // System.out.println(a);
        // System.out.println(a.indexOf(111111));
        // a.clear();


            Vector<Character> a = new Vector<Character>();
        
            for(Character i=0; i<200;i++){
                a.add(i);
            }

            System.out.println(a.size());
            System.out.println(a);


    }
}
