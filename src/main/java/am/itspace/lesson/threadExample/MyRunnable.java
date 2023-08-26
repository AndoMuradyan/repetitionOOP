package am.itspace.lesson.threadExample;


public class MyRunnable implements Runnable {
    private String name;
    private Long sleep;

    MyRunnable(String name, long sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        if (sleep != 0) {
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
//                do nothing
            }
        }
        System.out.println("In Run Method " + name);



    }
}
