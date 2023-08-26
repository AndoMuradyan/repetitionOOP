package am.itspace.lesson.threadExample.notify;

public class Consumer implements Runnable {

    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                queue.get();
            } catch (InterruptedException e) {
            }
        }
    }
}
