package am.itspace.lesson.collection.failFastAndFailSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {

    public static void main(String[] args) {
        Map<String,String> failFastMap = new HashMap<>();

        failFastMap.put("Sam Hanks","New York");
        failFastMap.put("Will Smith","LA");
        failFastMap.put("Scarlett","Chicago");
        failFastMap.put("Poxos Poxosyan","Armenia");
        Iterator iterator = failFastMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(failFastMap.get(iterator.next()));

            failFastMap.put("Petros Petrosyan","China");
        }
    }
}
