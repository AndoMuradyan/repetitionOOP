package am.itspace.lesson.threadExample.cuncurrency.lock.readWriteLock.exampleRWL;

public class Cruiser {
    private int health =100;
    private boolean isDamage;

    public void shoot(){
        health -=10;
        isDamage =true;

    }

    public int getHealth(){
        return health;
    }

    public void repair(){
        if (isDamage){
        health++;
        isDamage =false;
        }
    }

}
