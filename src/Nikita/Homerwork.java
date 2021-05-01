package Nikita;

public class Homerwork {
    public static void main(String[] args) {
        findTheSquareOfATriangle();
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

    private static void findTheSquareOfATriangle() {
        int a = 4;
        int b = 6;
        int c = 5;
        int result = a * b * c;
        System.out.println("вывод " + result);
    }
}
