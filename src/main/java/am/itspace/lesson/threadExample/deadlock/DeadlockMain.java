package am.itspace.lesson.threadExample.deadlock;

public class DeadlockMain {
    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();

        deadlock.deadlockStart();
    }
}
