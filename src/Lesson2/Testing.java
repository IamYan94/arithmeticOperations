package Lesson2;

import java.io.Console;
import java.util.Arrays;
import java.util.Collections;

public class Testing {
    public static void main(String[] args) {

        Testing Hw2 = new Testing();


        //  first  task
        Integer[] array = {2, 3, 1, 7, 11};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("First task : " + "" + '\n' + "Sorted Array");


        for (int array1 : array) {
            System.out.println(array1);
        }


        System.out.println("-------------------------------");

        System.out.println("Result second task : ");
        //second task

        int[] arrayNegatives = {-5, 6, -12, 11, -1};
        System.out.println(Hw2.sum_positive(arrayNegatives));
        System.out.println("-------------------------------");
        System.out.println("Result third task : ");

        //third task
        int[] arrayAvg = {1, 2, 4, 1};
        System.out.println(Hw2.avgSume(arrayAvg));
        System.out.println("---------------------------------");
        System.out.println("Result forth task :");


        //fourth task
        int[] replaceDublicates = {3, 2, 3, 1, 4, 2, 8, 3};
        int[] size = replaceDublicates.clone();
        for (int i = 0; i < size.length; i++)

            for (int j = i + 1; j < size.length; j++) {
                if (size[i] == size[j])
                    size[j] = 0;
            }
        System.out.println(Arrays.toString(size));
    }


    public int avgSume(int[] arr) {

        int result = 0;
        for (int elem : arr) {
            result += elem;
        }
        return result / arr.length;
    }


    public int sum_positive(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                sum += array[i];
        }
        return sum;
    }


}





















