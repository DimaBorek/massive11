package com.company;

public class Main {

    public static void main(String[] args) {

        int arrayPos[] = new int[6];
        int arrayNeg[] = new int[6];
        int arrayInd[] = new int[12];
        int arrayRes[] = new int[12];
        boolean markerInd;
        int tempIndex;

        for (int i = 0; i < arrayInd.length; i++) {
            arrayInd[i] = 99999;
            do {
                tempIndex = (int) (Math.random() * 12);
                markerInd = false;
                for (int j = 0; j < arrayInd.length; j++) {
                    if (tempIndex == arrayInd[j]) markerInd = true;
                }
            } while (markerInd);
            arrayInd[i] = tempIndex;
        }

        for (int i = 0; i < arrayPos.length; i++) {
            arrayPos[i] = (int) (Math.random() * 10 + 1);
            arrayNeg[i] = (int) (Math.random() * (-10) - 1);
        }

        for (int i = 0; i < arrayRes.length; i++) {
            if (i < 6) arrayRes[arrayInd[i]] = arrayPos[i];
            if (i >= 6) arrayRes[arrayInd[i]] = arrayNeg[i - 6];
        }

        for (int i = 0; i < arrayRes.length; i++) {
            System.out.print(arrayRes[i] + " ");
        }

    }
}