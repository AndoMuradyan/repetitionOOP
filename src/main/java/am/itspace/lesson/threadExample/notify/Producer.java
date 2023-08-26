package am.itspace.lesson.threadExample.notify;

public class Producer implements Runnable {

    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(10);
                queue.put();
            } catch (InterruptedException e) {
            }
        }
    }
}
