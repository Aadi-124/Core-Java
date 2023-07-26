
import java.util.*;


public class Multithreading implements Runnable{

    @Override
    public void run(){
        // for(int i=0;i<10;i++){
        //     System.out.println(Thread.currentThread().getName());
        // }
        // System.out.println("Thread.currentThread().getId() = "+Thread.currentThread().getId());
        
    }

    public static void main(String[] args) throws Exception{

        
        System.out.println("Thread.currentThread().getID() = "+Thread.currentThread().getId());
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().getPriority() = "+Thread.currentThread().getPriority());
        System.out.println("Thread.currentThread().getState() = "+Thread.currentThread().getState());
        System.out.println("Thread.currentThread().NORM_PRIORITY = "+Thread.currentThread().NORM_PRIORITY);
        System.out.println("Thread.currentThread().MAX_PRIORITY = "+Thread.currentThread().MAX_PRIORITY);
        System.out.println("Thread.currentThread().MIN_PRIORITY = "+Thread.currentThread().MIN_PRIORITY);
        
        Thread.currentThread().setPriority(8);
        Thread.currentThread().setName("Aadi Thread!");
        // Thread.currentThread().setDaemon(true);
        
        System.out.println("Thread.currentThread().getID() = "+Thread.currentThread().getId());
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().getPriority() = "+Thread.currentThread().getPriority());
        System.out.println("Thread.currentThread().getState() = "+Thread.currentThread().getState());
        System.out.println("Thread.currentThread().NORM_PRIORITY = "+Thread.currentThread().NORM_PRIORITY);
        System.out.println("Thread.currentThread().MAX_PRIORITY = "+Thread.currentThread().MAX_PRIORITY);
        System.out.println("Thread.currentThread().MIN_PRIORITY = "+Thread.currentThread().MIN_PRIORITY);
        

        SecondThread ST = new SecondThread();
        ST.start();

        FirstThread FT = new FirstThread();
        ShutDown SD = new ShutDown();
        Runtime R = Runtime.getRuntime();
        R.addShutdownHook(SD);
        R.addShutdownHook(FT);
        
        FirstThread FT2 = new FirstThread();
        SecondThread ST2 = new SecondThread();
        State S = new State(FT2,ST2);
        S.start();
        FT2.start();
        ST2.start();
        FT2.join();
        System.out.println("FT prioprity = "+FT2.getPriority());
        System.out.println("ST prioprity = "+ST2.getPriority());
        System.out.println("This is the last line of the program!");




//==================================== IMPORTANT!!!!=================================
// The java Runtime Claass
// In order to excute command from java to command prompt Runtime class is used!
// we can perform many task on system by using runtime class like:-
// Openning applications
// shutingdown the system.
// Basically the exec method of runtime class is used to execute CMD commands.
System.out.println("Runtime.getRuntime().availableProcessors() = "+Runtime.getRuntime().availableProcessors());
System.out.println("Runtime().getRuntime().totalMemory() = "+Runtime.getRuntime().totalMemory());
System.out.println("Runtime.getRuntime().freeMemory() = "+Runtime.getRuntime().freeMemory());






    }
}





class ShutDown extends Thread{

    @Override
    public void run(){
        try{
            System.out.println("This is the ShutDown Hook! from \"ShutDown\" Class");
            for(int i=0;i<10;i++){
                System.out.println("ShutDown Class!");
                Thread.sleep(200);
            }
        } catch(Exception E){
            E.printStackTrace();
        }
    }
}


class State extends Thread{
    
    Thread thread1;
    Thread thread2;
    
    public State(Thread T1, Thread T2){
       thread1 = T1;
       thread2 = T2;
    }

    public void run(){
       try{
           for(int i=0;i<10;i++){
               System.out.println("FT.State = "+thread1.getState());
               System.out.println("ST.State = "+thread2.getState());
            //    Thread.sleep(200);
           }
       } catch(Exception E){
        E.printStackTrace();
       }
    }
}


class SecondThread extends Thread{
    // SecondThread St = new SecondThread();
    ShutDown SD = new ShutDown();
    @Override 
    public void run(){
        Runtime R = Runtime.getRuntime();
        R.addShutdownHook(SD);
        try{
            for(int i=0; i<10;i++){
                System.out.println("Second Thread");
                Thread.sleep(300);
            }
        } catch(Exception E){
            System.out.println(E.getMessage());
        }
    }
}


class FirstThread extends Thread{
    @Override 
    public void run(){
        try{
            for(int i=0; i<10;i++){
                System.out.println("FirstThread");
                // Thread.sleep(200);
            }
        } catch(Exception E){
            System.out.println(E.getMessage());
        }
    }
}


