package am.itspace.lesson;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i%2==0){
            System.out.println("Weird");
        }else {
            System.out.println("not Weird");
        }
    }
}

