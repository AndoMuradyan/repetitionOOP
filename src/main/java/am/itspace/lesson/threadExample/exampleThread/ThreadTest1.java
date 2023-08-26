package am.itspace.lesson.threadExample.exampleThread;

public class ThreadTest1 {

    static int[] a = {4, 3, -7, 0, 78, 9};
    static int max = a[0];

    public static void main(String[] args) {
    Thread maxThread = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < a.length; i++) {
                if (max < a[i]){
                    max = a[i];
                }
            }
        }
    });

    maxThread .start();
        System.out.println(max);
    }
}
