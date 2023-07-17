public class This {
    

    public static void main(String[] args) {

        System.out.println("Hello World");
       Sample s = new Sample();
        s.this();
    }





}


class Sample {
    
    int a = 10;
    
    /**
     * 
     */
    public Sample(){
        int a = 20;
        System.out.println( "HELLOJOKER");
        System.out.println(this.a);
    }

    public void msg(){
        System.out.println("method!");
    }`

}
