package am.itspace.lesson.memoryOfJava;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = student; // student1 in veragrum enq verevi sarkac studenty ays depkum chi sarkum ekrord byekt ayl nayum e nuyn obyektin student1 y
        student = new Student(); //studentin asum enq vor du nor student es ays depkum ksarki nor obyekt
        student1 = null; // isk ays dekpum asenum enq vor du chkas

    }

}
