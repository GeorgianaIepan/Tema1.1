package com.company;

public class Aufgabe1 {
    //1. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als der
    //Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.
    public static int[] nichtAusreichteNote(int[] noten) {

        int[] note;
        note = new int[20];
        int j = 0;

        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 40) {
                note[j] = noten[i];
                j++;
            }
        }

        return note;
    }


    //2. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als der
    //Rückgabewert soll die Methode den Durchschnittswert liefern.
    public static int Durschnittnote(int[] noten) {

        int suma = 0;

        for (int i = 0; i < noten.length; i++) {
            suma = suma + noten[i];
        }
        suma = suma / noten.length;

        return suma;
    }


    //3. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als der
    //Rückgabewert soll die Methode eine Array mit die abgerundete Noten liefern.
    public static int[] abgerundeteNote(int[] noten) {

        for (int i = 0; i < noten.length; i++) {
            if (noten[i] - noten[i] % 5 < 3 && noten[i] >= 38) {
                noten[i] = noten[i] + 5 - noten[i] % 5;
            } else {
                noten[i] = noten[i];
            }
        }

        return noten;
    }


    //4. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als der
    //Rückgabewert soll die Methode die maximale abgerundete Note liefern.
    public static int maxNote(int[] noten) {

        noten = abgerundeteNote(noten);
        int max = -1;

        for (int i = 0; i < noten.length; i++) {
            if (noten[i] > max) {
                max = noten[i];
            }
        }

        return max;
    }
}
