package am.itspace.lesson.threadExample.threadLocal;

import java.lang.ThreadLocal;

public class ThreadLocalExam {

    public static void main(String[] args) {

        ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();

        threadLocalValue.set(78);

        Integer result = threadLocalValue.get();
        System.out.println(result);
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);
        System.out.println(threadLocal.get());


    }
}
