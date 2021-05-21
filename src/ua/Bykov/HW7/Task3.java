package ua.Bykov.HW7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Vector[] vector = new Vector[2];
        vector[0] = new Vector(1, 2, 3);
        vector[1] = new Vector(3, 2, 1);
        System.out.println(vector[0].productByVector(vector[1]).toString());
        System.out.println(vector[0].calculatingTheCos(vector[1]));
        System.out.println(vector[0].getSum(vector[1]).toString());
        System.out.println(vector[0].getDif(vector[1]).toString());
        System.out.println(Arrays.toString(Vector.returningAnArray(5)));
    }
}
