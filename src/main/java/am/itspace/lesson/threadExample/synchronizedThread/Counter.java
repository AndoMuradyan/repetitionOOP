package am.itspace.lesson.threadExample.synchronizedThread;

public class Counter {


    private  int count = 0;

//     public synchronized void increment(){
//         count++;
//     }
     public synchronized void increment(){
         System.out.println("Hello ");
//         synchronized (this){
             count++;
//         }
     }

    public synchronized void decrement(){
        System.out.println("Bye!! ");

//        synchronized (this){
         count--;
//        }
     }

     public int getCount(){
         return count;
     }
}
