package ua.Bykov.HW5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int numbers[][] = new int[4][4];
        fillArrayDesk(numbers);
        for (int[] InnerArray : numbers) {
            System.out.println(Arrays.toString(InnerArray));
        }
        System.out.println();
        for (int[] innerArray : castling(numbers)) {
            System.out.println(Arrays.toString(innerArray));
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

    private static int[][] castling(int[][] numbers) {
        int[][] newInt = new int[numbers.length][numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                newInt[j][i] = numbers[i][j];
            }
        }
        return newInt;
    }
}
