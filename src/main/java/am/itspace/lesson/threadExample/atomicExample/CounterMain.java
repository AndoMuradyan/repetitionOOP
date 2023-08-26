package am.itspace.lesson.threadExample.atomicExample;

public class CounterMain {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter( );
        Thread t1 = new Thread(new Incrementer(counter));
        Thread t2 = new Thread(new Decrement(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}

