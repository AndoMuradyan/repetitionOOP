package am.itspace.lesson.memoryOfJava;

import java.util.HashSet;

public class EqualsAndHashCodeMain {
    public static void main(String[] args) {

        Person person = new Person("Hayk", 20);
        Person person1 = new Person("Hayk", 20);

        System.out.println(person == person1);
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());

        HashSet<Person> person2 = new HashSet<>();
        person2.add(person);
        System.out.println(person2.contains(person1));
        System.out.println("----------------------------");
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String name = "And";
        String surname = "Muradyan";
        String result = "Barev " + " " + name + " " + surname + " " + " 2023";
        System.out.println(result); //ete uzum enq nman result stananq lav tarberak che + e=relov irar kpcnenq ka lav tarberak orinak

        StringBuilder stringBuilder = new StringBuilder();
        String result1 = stringBuilder.append("barev ")
                .append(name)
                .append(" ")
                .append(surname)
                .append(" 2023").toString();
        System.out.println(result1);
    }
}
