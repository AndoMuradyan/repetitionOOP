package am.itspace.lesson.collection.failFastAndFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo1 {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

        map.put("One", 1);
        map.put("Seven", 7);
        map.put("Five", 5);
        map.put("Eight", 8);

        Iterator iterator = map.keySet().iterator();


        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            System.out.println(key + " : " + map.get(key));

            map.put("Nine", 9);

        }

    }
}
