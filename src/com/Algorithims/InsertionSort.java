package com.Algorithims;

import java.io.FileReader;
import java.io.IOException;

public class InsertionSort {
    int n;

    public InsertionSort(int n) {
        this.n = n;
    }

    public GetAxis Analysis() {
        String[] insertionX = new String[n];             //elements of x-axis(CategoryAxis)
        long[] insertionY = new long[n];                 //elements of y-axis(NumberAxis)
        int insertionIndex = 0;

        for (int j = 1; j <= n; j++) {
            //Fill array to be sorted
            int[] InsertionArray = new ArrayGenerator(j).ReadFile(j);

            //Insertion Sort Analysis
            int NumOfSteps = RunningTime(InsertionArray);
            insertionX[insertionIndex] = String.valueOf(j);
            insertionY[insertionIndex] = NumOfSteps;

            insertionIndex++;
        }

        return new GetAxis(insertionX, insertionY);
    }

    public int RunningTime(int[] A) {
        int counter = 0;
        {    //Sort Array
            int n = A.length;
            for (int j = 1; j < n; j++) {
                int key = A[j];
                int i = j - 1;
                while (i >= 0 && A[i] > key) {
                    A[i + 1] = A[i];
                    counter++;
                    i = i - 1;
                    counter++;
                }
                A[i + 1] = key;
                counter++;
            }
        }
        return counter;
    }
}
