package com.company;

public class Aufgabe2 {
    //1. Finden Sie die maximale Zahl.
    public static int maxZahl(int[] zahlen) {

        int max = zahlen[0];

        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
        }

        return max;
    }


    //2. Finden Sie die minimale Zahl.
    public static int minZahl(int[] zahlen) {

        int min = zahlen[0];

        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] < min) {
                min = zahlen[i];
            }
        }

        return min;
    }


    //3. Finden Sie die maximale Summe von n-1 Zahlen.
    public static int maxSumme(int[] zahlen) {

        int sum = 0;

        for (int i = 0; i < zahlen.length; i++) {
            sum = sum + zahlen[i];
        }
        sum = sum - minZahl(zahlen);

        return sum;
    }


    //4. Finden Sie die minimale Summe von n-1 Zahlen.
    public static int minSumme(int[] zahlen) {

        int sum = 0;

        for (int i = 0; i < zahlen.length; i++) {
            sum = sum + zahlen[i];
        }
        sum = sum - maxZahl(zahlen);

        return sum;
    }
}
