package com.Algorithims;

import java.io.FileReader;
import java.io.IOException;

public class SelectionSort {
    int n;

    public SelectionSort(int n) {
        this.n = n;
    }
    public GetAxis Analysis() {
        String[] selectionX = new String[n];             //elements of x-axis(CategoryAxis)
        long[] selectionY = new long[n];                 //elements of y-axis(NumberAxis)
        int selectionIndex = 0;

        for (int j = 1; j <= n; j++) {
            //Fill array to be sorted
            int[] SelectionArray = new ArrayGenerator(j).ReadFile(j);

            //Selection Sort Analysis
            int NumOfSteps = RunningTime(SelectionArray);
            selectionX[selectionIndex] = String.valueOf(j);
            selectionY[selectionIndex] = NumOfSteps;

            selectionIndex++;
        }

        return new GetAxis(selectionX, selectionY);
    }

    public int RunningTime(int[] A) {
        int n = A.length;
        int counter=0;

        for (int i = 0; i < n - 1; ++i) {
            counter++;
            int minIdx = i;

            int j;
            for (j = i + 1; j < n; ++j) {
                counter++;
                if (A[j] < A[minIdx]) {
                    minIdx = j;
                    counter++;
                }
            }
            j = A[minIdx];
            A[minIdx] = A[i];
            A[i] = j;
            counter=counter+3;
        }
        counter++;

        return counter;
    }
}
