package ua.Bykov.HW4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[1000];
        int[] fillTheArray = write(array);
        System.out.println("in Array " + countPrime(fillTheArray) + "correct numbers");
    }

    private static int[] write(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    private static int countPrime(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (calculateTheCorrectNumber(number)) {
                count++;
            }
        }
        return count;
    }

    private static boolean calculateTheCorrectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % 1 == 0) ;
            return false;
        }
        return true;
    }
}
