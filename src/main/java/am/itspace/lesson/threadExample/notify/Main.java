package am.itspace.lesson.threadExample.notify;

public class Main {
    public static void main(String[] args) {
        // Element qcel ev stanal put qcel got stanal kodi hadvac
    Queue q = new Queue();

    Thread prod = new Thread(new Producer(q));
    Thread cons = new Thread(new Consumer(q));

    prod.start();
    cons.start();
    }
}
