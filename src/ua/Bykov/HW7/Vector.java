package ua.Bykov.HW7;

import java.util.Random;

public class Vector {
    protected int x;
    protected int y;
    protected int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    double lengthСalculation(Vector vector) {
        return Math.abs(Math.sqrt(Math.pow(vector.x, 2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2)));

    }


    Vector productByVector(Vector vector) {
        int X = y * vector.z - z * vector.y;
        int Y = z * vector.x - x * vector.z;
        int Z = x * vector.y - y * vector.x;
        return new Vector(X, Y, Z);

    }

    public double calculatingTheCos(Vector vector) {
        int scalarProduct = x * vector.x + y * vector.y + z * vector.z;
        double lengthOfVector1 = Math.abs(Math.sqrt(Math.pow(x, 2)
                + Math.pow(y, 2) + Math.pow(z, 2)));
        double lengthOfVector2 = Math.abs(Math.sqrt(Math.pow(vector.x, 2)
                + Math.pow(vector.y, 2) + Math.pow(vector.z, 2)));
        return scalarProduct / (lengthOfVector1 * lengthOfVector2);

    }

    public Vector getSum(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector getDif(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] returningAnArray(int n) {
        Random random = new Random();
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(random.nextInt(5), random.nextInt(5), random.nextInt(5));
        }
        return vectors;
    }
}

