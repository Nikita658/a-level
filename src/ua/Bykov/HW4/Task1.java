package ua.Bykov.HW4;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int arr[] = new int[400];
        int[] fillTheArray = write(arr);
        System.out.println("arithmetic mean " + arichmetickMean(fillTheArray));
        System.out.println("Geometric mean " + geometrickMean(fillTheArray));
    }

    private static double geometrickMean(int[] arr) {
        double x = 1.0;
        double division;
        for (int element : arr) {
            x *= element;
        }
        division = Math.pow(x, 1.0 / (double) arr.length);
        ;
        return division;
    }


    private static double arichmetickMean(int[] arr) {
        double sum = 0;
        double division;
        for (int element : arr) {
            sum += element;
        }
        division = sum / arr.length;
        return division;
    }

    private static int[] write(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10) + 1;
        }
        return arr;
    }
}