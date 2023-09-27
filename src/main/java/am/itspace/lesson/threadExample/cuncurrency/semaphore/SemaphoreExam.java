package am.itspace.lesson.threadExample.cuncurrency.semaphore;


import java.util.concurrent.Semaphore;

public class SemaphoreExam {

    public static void main(String[] args) {


        Semaphore table = new Semaphore(2);

        PersonSemaphoreExam person = new PersonSemaphoreExam();
        PersonSemaphoreExam person2 = new PersonSemaphoreExam();
        PersonSemaphoreExam person3 = new PersonSemaphoreExam();
        PersonSemaphoreExam person4 = new PersonSemaphoreExam();
        PersonSemaphoreExam person5 = new PersonSemaphoreExam();
        PersonSemaphoreExam person6 = new PersonSemaphoreExam();
        PersonSemaphoreExam person7 = new PersonSemaphoreExam();

        person.table = table;
        person2.table = table;
        person3.table = table;
        person4.table = table;
        person5.table = table;
        person6.table = table;
        person7.table = table;

        person.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
        person7.start();
    }
}
