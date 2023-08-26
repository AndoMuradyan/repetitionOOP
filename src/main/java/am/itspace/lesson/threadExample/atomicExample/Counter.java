package am.itspace.lesson.threadExample.atomicExample;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private AtomicInteger count = new AtomicInteger();


    public void increment() {
        count.incrementAndGet();

    }

    public  void decrement() {
    count.decrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
