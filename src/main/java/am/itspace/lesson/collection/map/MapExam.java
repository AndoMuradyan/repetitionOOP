package am.itspace.lesson.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExam {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(11, "Green");
        map.put(15, "Black");
        map.put(9454, "Red");
        map.put(19, "White");
        map.put(19, "White");

        System.out.println("HashMap iteration Order: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
