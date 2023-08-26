package am.itspace.lesson.threadExample.sandbox;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    //24755700 stream
    //58168700 parallelStream
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i + "");
        }
        long startTime = System.nanoTime();
        arrayList.parallelStream().map(s -> s+"a").collect(Collectors.toList());

        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
