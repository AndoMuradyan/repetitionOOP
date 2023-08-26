package am.itspace.lesson.threadExample.cuncurrency.lock.readWriteLock.exampleRWL;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CounterRWLMain {
    public static void main(String[] args) throws InterruptedException {

        CounterLockExample counterLockExample = new CounterLockExample();
//        Lock lock = new ReentrantLock();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Thread t1 = new Thread(() -> {
            lock.readLock().lock();
            for (int i = 0; i <100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                counterLockExample.increment();
                System.out.println("Incrementing");
            }
            lock.readLock().unlock();
        });

        Thread t2 = new Thread(() ->{
            while (Thread.currentThread().isInterrupted()){
                lock.readLock().lock();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println(counterLockExample.getCount());
                lock.readLock().unlock();
            }
        });
        
        t1.start();
        t2.start();

        Thread.sleep(10000);
        t1.interrupt();
        t2.interrupt();

        t1.join();
        t2.join();

        System.out.println(counterLockExample.getCount());
    }
}
