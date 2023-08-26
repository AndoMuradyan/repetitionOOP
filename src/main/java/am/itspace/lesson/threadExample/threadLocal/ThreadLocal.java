package am.itspace.lesson.threadExample.threadLocal;

public class ThreadLocal {
    static java.lang.ThreadLocal<String> threadLocal = new java.lang.ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        threadLocal.set("Hello wold!");
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.println("Main " + threadLocal.get());
    }

    static class ThreadOne extends Thread {
        @Override
        public void run() {
            threadLocal.set("ThreadOne");
            try {
                Thread.sleep(52);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ThreadOne " + threadLocal.get());
        }
    }

    static class ThreadTwo extends Thread {
        @Override
        public void run() {
            threadLocal.set("ThreadTwo");
            System.out.println("ThreadTwo " + threadLocal.get());
        }
    }
}
