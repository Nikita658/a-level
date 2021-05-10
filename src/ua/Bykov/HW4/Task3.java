package ua.Bykov.HW4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int array[] = new int[1000];
        int[] fillTheArray = write(array);
        System.out.println("in Array " + countCompositeNumbers(fillTheArray) + "composite numbers");
    }
    private static int[] write(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }
    private static int countCompositeNumbers(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            if (isCompositeNumbers(num)) {
                count++;
            }
        }
        return count;
    }
    private static boolean isCompositeNumbers(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return true;
        }
        return false;
    }
}