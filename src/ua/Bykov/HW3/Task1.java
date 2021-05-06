package ua.Bykov.HW3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        var s = new Scanner(System.in).nextLine();
        s = emovingSpaces(s);
        System.out.println(s.replaceAll("\\s+", ""));
        emovingSpaces(s);
        isPalindrome(s);
    }

    private static String emovingSpaces(String s) {
        String filtered = (s);
        return filtered;
    }

    private static void isPalindrome(String s) {
        StringBuilder textReverse = new StringBuilder(s);
        textReverse.reverse();
        String textR = textReverse.toString();
        if (s.equals(textR)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

