package Nikita;

public class Homerwork {
    public static void main(String[] args) {
        findTheSquareOfATriangle(1,2,3,4,5,1);
        checkIfNumberEven(121);
        findTheSmallestModule(1.2, -2.3, 2.5);
    }

    private static void findTheSmallestModule(double num1, double num2, double num3) {
        double result1 = num1 > 0 ? num1 : -num1;
        double result2 = num2 > 0 ? num2 : -num2;
        double result3 = num3 > 0 ? num3 : -num3;
        if (result1 < result2 && result1 < result3) {
            System.out.println("самый маленький модуль" + result1);

        } else if (result2 < result1 && result2 < result3) {
            System.out.println("самый маленький модуль" + result2);
        } else if (result3 < result1 && result3 < result2) {
            System.out.println("самый маленький модуль" + result3);
        }
    }

    private static void checkIfNumberEven(int number) {
        if (number % 2 == 0) {
            System.out.println("четное " + number);
        } else {
            System.out.println("не четное " + number);
        }
    }

    private static void findTheSquareOfATriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        int square = Math.abs((x1 - x3) * (y2 - y1) - (x1 - x2) * (y3 - y1)) / 2;
        System.out.println("Square of triangle: " + square);

        System.out.println();
    }
}

