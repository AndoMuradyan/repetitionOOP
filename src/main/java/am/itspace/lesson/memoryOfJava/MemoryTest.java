package am.itspace.lesson.memoryOfJava;

public class MemoryTest {
    public static void main(String[] args) {
        int a = 5;

        f();

        g();
    }

    private static void g() {
        int k = 2;
    }

    private static void f() {
        int a = 1;
    }
}


