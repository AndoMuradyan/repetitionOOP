package am.itspace.lesson.threadExample.cuncurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWListExample {
    public static void main(String[] args) throws InterruptedException {
//        ArrayList<Integer> ints = new ArrayList<>();
        CopyOnWriteArrayList<Integer> ints = new CopyOnWriteArrayList<>();

        ints.add(1);
        ints.add(123);
        ints.add(1400);
        ints.add(600);
        ints.add(10);

        Thread t1 = new Thread(() -> {
            Iterator<Integer> iterator = ints.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(iterator.next() + " ");
            }

            System.out.println();
//            System.out.println("in thread 1: ");
//            System.out.println(ints);
        });

        Thread t2 = new Thread(() -> {
            ints.remove(3);

            System.out.println("in thread 2: ");
            System.out.println(ints + " ");

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("in main thread");
        System.out.println(ints);
    }
}
