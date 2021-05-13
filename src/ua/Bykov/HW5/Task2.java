package ua.Bykov.HW5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = fillArrayDesk(5);
        System.out.println(Arrays.toString(numbers));
        System.out.println(sortingCheck(numbers));

    }

    private static int[] fillArrayDesk(int num) {
        int[] numbers = new int[num];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5);
        }
        return numbers;
    }

    private static boolean sortingCheck(int[] numbers) {
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] > numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

}

