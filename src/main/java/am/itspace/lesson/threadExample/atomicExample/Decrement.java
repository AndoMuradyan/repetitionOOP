package am.itspace.lesson.threadExample.atomicExample;

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
