package am.itspace.lesson.threadExample.volatileExample;

public class VolatileExample {

    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            System.out.println("Writer Thread: Changing flag to true");
            flag = true;
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Wait until the flag becomes true
            }
            System.out.println("Reader Thread: Flag is now true");
        });

        writerThread.start();
        readerThread.start();
    }
}
