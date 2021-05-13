package ua.Bykov.HW5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int numbers[][] = new int[5][5];
        fillArrayDesk(numbers);
        checkingForStrings(numbers);
        for (int[] InnerArray : numbers) {
            System.out.println(Arrays.toString(InnerArray));
        }
    }


    private static int[][] fillArrayDesk(int[][] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = random.nextInt(100);
            }
        }
        return numbers;
    }

    private static int[][] checkingForStrings(int[][] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = (i % 2 == 0) ? count : -count;
                count++;
            }
        }
        return numbers;
    }
}

