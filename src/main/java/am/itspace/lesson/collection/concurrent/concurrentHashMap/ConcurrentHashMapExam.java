package am.itspace.lesson.collection.concurrent.concurrentHashMap;

import ch.qos.logback.core.spi.AbstractComponentTracker;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Collections.synchronizedMap;

public class ConcurrentHashMapExam {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> hashMap = new ConcurrentHashMap<>();


        hashMap.put(1, 10);
        hashMap.put(2, 17);
        hashMap.put(3, 2);
        hashMap.put(4, 18);
        hashMap.put(5, 24);
//        Map<Integer, Integer> integerIntegerMap = synchronizedMap(hashMap);
//        integerIntegerMap.put(1,1);
//        integerIntegerMap.put(2,1);
//        integerIntegerMap.put(3,1);
//        integerIntegerMap.put(4,1);
//        integerIntegerMap.put(5,1);
        Set<ConcurrentHashMap.Entry<Integer, Integer>> entries = hashMap.entrySet();
        for (ConcurrentHashMap.Entry<Integer, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value % 2 == 1) {
                System.out.println(value);
            }
        }

    }
}
