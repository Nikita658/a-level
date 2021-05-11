package ua.Bykov.HW4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int array[] = new int[2000];
        int[] fillTheArray = write(array);
        System.out.println( Arrays.toString(fillTheArray));
        System.out.println("even numbers are replaced " + changeEvenToZero(fillTheArray));
    }

    private static int changeEvenToZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
            {
                array[i] = 0;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        return count;
    }

    private static int[] write(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(200);
        }
        return array;
    }

}