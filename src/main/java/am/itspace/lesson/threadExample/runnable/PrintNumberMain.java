package am.itspace.lesson.threadExample.runnable;

public class PrintNumberMain {
    public static void main(String[] args) {
        System.out.println("Start of main thread");
        Thread thread = new Thread(new PrintNumber());
        thread.start();
        System.out.println("End of main thread");
    }
}
