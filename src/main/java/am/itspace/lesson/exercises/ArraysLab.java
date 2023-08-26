package am.itspace.lesson.exercises;

public class ArraysLab {

    public static void main(String[] args) {
        System.out.println("1. Print numbers from 1 to 15");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n 2. Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n 3. Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i = i + 2) {

            System.out.print(i + " ");

        }

        System.out.println("\n\n 4. Print * symbols using given number");
//        *
//        * *
//        * * *
//        * * * *

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n 5. Print * symbols using given number in reverse mode");
//        * * * *
//        * * *
//        * *
//        *

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n6. Create an array with number 1 - 11");

        int[] array = new int[11];
//        int k = 1; Other
//        for (int i = 0, k = 1; i < array.length; i++, k++) { Other
//            array[i] = k;
//        }
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
//            k++; Other
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n 7. Create am array with even numbers from -10 to 10");

        int[] array1 = new int[11];
        for (int i = 0, j = -10; i < array1.length; i++, j += 2) {
            array1[i] = j;

        }
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("\n 8. Given an array print count of odd elements");
        int[] array2 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 1) {
                System.out.print(array2[i] + " ");
            }
        }

        System.out.println("\n 9. Given an array print elements from -10 to 5");
        for (int i : array2) {
            if (i >= -10 && i <= 5) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n 10. Given an array print elements which can be divided 3 or 4");
        for (int i : array2) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n 11. Given an array .print count  of even elements");
        int countOfEvents = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 0) {
                countOfEvents++;

            }
        }
        System.out.print("Cont of even elements " + countOfEvents);
        array2 = new int[]{4, 1, 9, -4, 0, 3};

        System.out.println("\n 12. Given an array .print sum of elements");
        int sum = array2[0];
        for (int i = 1; i < array2.length; i++) {
            sum = sum + array2[i];
        }
        System.out.print("Sum elements " + sum);

        System.out.println("\n 11. Given an array .print sum of  positive elements");

        sum = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 0) {
                sum += array2[i];
            }

        }
        System.out.println("positive elements sum " + sum);


        System.out.println("\n 12. Given an array .print multiplication of  positive elements");

        int[] array3 = {4, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        int sum1 = 1;
        for (int i = 0; i < array3.length; i++) {
            sum1 = sum1 * array3[i];
        }
        System.out.println(sum1);

        System.out.println("\n 12. Find maximal element from array ");
        int[] array4 = {4, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        int max = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] > max) {
                max = array4[i];
            }
        }
        System.out.println("maximal element " + max);


        System.out.println("\n 13. Find minimal element from array ");
        int min = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] < min) {
                min = array4[i];
            }
        }
        System.out.println("minimal element " + min);

        System.out.println("\n14. find element which is alone");
        array = new int[]{4, 2, 1, 9, 2, 1, 4};

        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i]; // iksor arac... gdnel chkrknvoc elementy
        }
        System.out.println(result);

        System.out.println("\n15.Sort array in asc");

        array = new int[]{4, 1, -9, 2, 1, 0, -748, 12, 445, 8};

        for (int i : array) {
            System.out.print(i + " ");
        }

        boolean qaniDerIfMtnume = true;
        while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int asc = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = asc;
                    qaniDerIfMtnume = true;
                }
            }
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }



    }
}
