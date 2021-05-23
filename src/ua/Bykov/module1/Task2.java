package ua.Bykov.module1;

import java.util.Scanner;

public class Task2 {
    private final static String X = "ABCDEFGH";
    private final static String Y = "12345678";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" position:");
        String current = input.nextLine();
        System.out.println(" next position:");
        String next = input.nextLine();

        System.out.println("will it next position " + checkOnTheMove(current, next));
    }

    static boolean checkOnTheMove(String currentCell, String nextCell) {
        String current = currentCell.toUpperCase();
        String next = nextCell.toUpperCase();

        int xDiff = findЕTheDifference(current.charAt(0), next.charAt(0), Task2.X);
        int yDiff = findЕTheDifference(current.charAt(1), next.charAt(1), Task2.Y);

        return (xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2);
    }

    static int findЕTheDifference(char current, char next, String reference) {
        return Math.abs(reference.indexOf(current) - reference.indexOf(next));
    }
}

