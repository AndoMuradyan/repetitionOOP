package am.itspace.lesson.threadExample.notify;

public class Queue {

    private int value;

    private boolean valueSet;

    public synchronized void put() throws InterruptedException {

        while (valueSet) {
            wait();
        }
        ++value;
        System.out.println("Put value. " + value);
        valueSet = true;
        notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (!valueSet) {
            wait();
        }
        System.out.println("Got value. " + value);
        notifyAll();
        valueSet = false;
        return value;
    }
}
