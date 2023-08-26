package am.itspace.lesson.threadExample.deadlock;

public class A {

    synchronized void foo(B b){
        String tName = Thread.currentThread().getName();

        System.out.println(tName + " entered A.foo()");
        try {

        Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("A interrupted!");
        }

        System.out.println(tName + " trying to call B.last()");
//        main thready porceky vercnel b i monitor
        b.last();
    }

    synchronized void last(){
        System.out.println("In A.last(). ");
    }
}
