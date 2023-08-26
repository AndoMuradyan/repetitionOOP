package am.itspace.lesson.threadExample.cuncurrency.lock.readWriteLock.exampleRWL;

public class CruiserMain {
    public static void main(String[] args) throws InterruptedException {

        Cruiser cruiser = new Cruiser();

        Thread enemyShip = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Error while repair thread execution!");
                    Thread.currentThread().interrupt();
                }
                cruiser.shoot();
                System.out.println("Ship health after shoot " + cruiser.getHealth());
            }
        });

        Thread port = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Error while shoot thread execution!");
                    Thread.currentThread().interrupt();
                }
                cruiser.repair();
                System.out.println("Ship health after repair " + cruiser.getHealth());

            }
        });

        enemyShip.start();
        port.start();

        Thread.sleep(1000);

        enemyShip.interrupt();
        port.interrupt();

        enemyShip.join();
        port.join();

        System.out.println("Thread ship health " + cruiser.getHealth());
    }
}
