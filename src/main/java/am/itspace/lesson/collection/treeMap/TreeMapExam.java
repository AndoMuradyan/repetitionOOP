package am.itspace.lesson.collection.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(9, "Red");
        treeMap.put(12, "Black");
        treeMap.put(6, "Green");
        treeMap.put(1, "White");


        System.out.println("TreeMap iteration Order ");

        for(Map.Entry<Integer, String>entry: treeMap.entrySet()){
            System.out.println(entry.getKey() + " = " +entry.getValue());
        }
        }
}
