package am.itspace.lesson.threadExample.cuncurrency.lock.readWriteLock.exampleRWL;


public class CounterLockExample {

    private double volInteger = 0;

    public void increment() {

        volInteger++;

    }

    public void decrement() {

        volInteger--;
    }

    public double getCount() {
        return volInteger;
    }
}
