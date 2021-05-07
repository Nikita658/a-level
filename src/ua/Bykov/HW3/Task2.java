package ua.Bykov.HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter words separated by space");
        String input = s.nextLine();
        System.out.println(countWord(input));
    }

    private static int countWord(String input) {
        int count = 0;
        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ' && input.charAt(i - 1) != ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}