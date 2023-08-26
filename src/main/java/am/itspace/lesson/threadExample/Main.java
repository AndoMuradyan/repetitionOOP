package am.itspace.lesson.threadExample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable("Thread 1",0));
        Thread t2 = new Thread(new MyRunnable("Thread 2",0));
        Thread t3 = new Thread(new MyRunnable("Thread 3",0));

//        t1.setDaemon(true);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(1);
        t3.setPriority(Thread.MIN_PRIORITY);

        t3.join();
        t1.start();
        t2.start();
        t3.start();
//        System.out.println(t1.isAlive());  knaye tval threade voxche te voch
//        t1.join();
//        t2.join();
//        t3.join();

//        Thread.sleep(1000); kdadare ashxately mer tvac jamanaka hatvacuov

        System.out.println("In Main Method.");
    }

}
