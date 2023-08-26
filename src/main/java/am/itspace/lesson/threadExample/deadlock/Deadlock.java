package am.itspace.lesson.threadExample.deadlock;

public class Deadlock implements Runnable{
    private A a = new A();
    private B b = new B();

    Thread t;

    Deadlock(){
        Thread.currentThread().setName("Main thread.");
        t = new Thread(this,"Racing thread.");
    }

    void deadlockStart(){
        t.start();
        a.foo(b);
        System.out.println("Back in main thread.");
    }

    @Override
    public void run() {
    b.bar(a);
        System.out.println("Back in other thread.");
    }

}
