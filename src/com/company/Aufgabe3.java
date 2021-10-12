package com.company;

public class Aufgabe3 {
    public int[] sum(int[] zahl1, int[] zahl2) {

        int length = Math.min(zahl1.length, zahl2.length);
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = zahl1[i] + zahl2[i];
        }

        return result;
    }

    public int[] dif(int[] zahl1, int[] zahl2) {

        int length = Math.min(zahl1.length, zahl2.length);
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = zahl1[i] - zahl2[i];
        }

        return result;
    }

    public int[] mul(int[] zahl1, int n) {

        int[] result = new int[zahl1.length];

        for (int i = 0; i < zahl1.length; i++) {
            if (n <= 9) {
                result[i] = zahl1[i] * n;
            }
        }

        return result;
    }

    public int[] div(int[] zahl1, int n) {

        int[] result = new int[zahl1.length];

        for (int i = 0; i < zahl1.length; i++) {
            if (n <= 9) {
                result[i] = zahl1[i] / n;
            }
        }

        return result;
    }
}
