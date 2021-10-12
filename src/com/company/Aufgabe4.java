package com.company;

public class Aufgabe4 {
    //1. Schreiben Sie eine Methode, welche die billigste Tastatur zurückgibt.
    public static int minPretTastatur(int[] pret) {

        int min = pret[0];

        for (int i = 0; i < pret.length; i++) {
            if (pret[i] < min) {
                min = pret[i];
            }
        }

        return min;
    }

    //2. Schreiben Sie eine Methode, welche den teuersten Gegenstand zurückgibt.
    public static int maxPretTotal(int[] pret1, int[] pret2) {

        int max1 = -1;
        int max2 = -1;

        for (int i = 0; i < pret1.length; i++) {
            if (pret1[i] > max1) {
                max1 = pret1[i];
            }
        }

        for (int i = 0; i < pret2.length; i++) {
            if (pret2[i] > max2) {
                max2 = pret2[i];
            }
        }

        if (max1 > max2)
            return max1;
        else
            return max2;
    }

    //3. Schreiben Sie eine Methode, welche das teuerste USB Laufwerk, das Markus kaufen
    //kann, zurückgibt.
    public static int maxPretUSB(int[] pret, int bani) {

        int max = -1;

        for (int i = 0; i < pret.length; i++) {
            if (pret[i] > max && pret[i] <= bani) {
                max = pret[i];
            }
        }

        return max;
    }

    //4. Finden Sie, anhand Markus’ Budget und der Preislisten für die Tastaturen und USB-Laufwerke,
    //den maximalen Geldbetrag, der von Markus ausgegeben wird.
    // Wenn er nicht genug für beide hat, geben Sie stattdessen -1 zurück.
    // Er kauft nur die zwei benötigten Gegenstände.
    public static int maxPretCumparare(int bani, int[] pret1, int[] pret2) {

        int max = -1;

        for (int i = 0; i < pret1.length; i++) {
            for (int j = 0; j < pret2.length; j++) {

                int sum = pret1[i] + pret2[j];
                if (sum > bani)
                    return -1;

                if (sum > max && sum <= bani)
                    max = sum;
            }
        }

        return max;
    }
}
