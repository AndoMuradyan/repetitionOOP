package am.itspace.lesson.threadExample.deadlock;

public class B {
    synchronized void bar(A a) {

        String tName = Thread.currentThread().getName();
        System.out.println(tName + "entered B.bar()");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("B interrupted");
        }
        System.out.println(tName + " trying to call A.last()");
        a.last();
    }


    synchronized void last() {
        System.out.println("In B.last(). ");
    }
}
