package ua.Bykov.HW3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        var s = new Scanner(System.in).nextLine();
        s = filteredString(s);
        System.out.println(s.replaceAll("\\s+", s));
        boolean palindrome = isPalindrome(s);
        filteredString(s);
        isPalindrome(s);
    }

    private static String filteredString(String s) {
        String filtered = s.replaceAll("\\s+", "");
        return filtered;
    }

    private static boolean isPalindrome(String s) {
        StringBuilder textReverse = new StringBuilder(s);
        textReverse.reverse();
        String textR = textReverse.toString();
        return s.equalsIgnoreCase(textR);

    }
}

