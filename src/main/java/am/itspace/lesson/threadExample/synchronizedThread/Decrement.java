package am.itspace.lesson.threadExample.synchronizedThread;

public class Decrement implements Runnable{

    private final Counter counter;

    Decrement (Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            counter.decrement();
        }
    }
}
