package com.Algorithims;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MergeSort {
    int n;
    int stepscounter=0;
    public MergeSort(int n) {
        this.n = n;
    }

    public int MergeSortAlgorithm(int[] A) {
        stepscounter++;
        if (A.length <= 1) {
            return stepscounter ;
        } else {
            stepscounter++;
            int m = (A.length) / 2;
            //temporary arrays
            int[] left = Arrays.copyOfRange(A, 0, m);
            int[] right = Arrays.copyOfRange(A, m+1, A.length);
            this.MergeSortAlgorithm(left);
            this.MergeSortAlgorithm(right);
           stepscounter=stepscounter+ this.Merge(A, left, right);

        }
        return stepscounter;
    }
    public int Merge(int[] A, int[] left, int[] right) {
        int j = 0;
        int k = 0;
        int l = 0;
        int NumOfSteps=0;

        while (j < left.length && k < right.length) {
            if (left[j] < right[k]) {
                A[l] = left[j];
                NumOfSteps++;
                ++l;
                ++j;
            } else {
                A[l] = right[k];
                NumOfSteps++;
                ++l;
                ++k;
            }
            NumOfSteps++;
        }

        while (j < left.length) {
            A[l] = left[j];
            NumOfSteps++;
            ++l;
            ++j;
        }
        NumOfSteps++;

        while (k < right.length) {
            NumOfSteps++;
            A[l] = right[k];
            ++l;
            ++k;
        }
        NumOfSteps++;

        return NumOfSteps;

    }
    public GetAxis Analysis(){
        String[] MergeX = new String[n];             //elements of x-axis(CategoryAxis)
        long[] MergeY = new long[n];                 //elements of y-axis(NumberAxis)
        int MergeIndex = 0;

        for (int j = 1; j <= n; j++) {
             stepscounter=0;
            //Fill array to be sorted
            int[] MergeArray = new ArrayGenerator(j).ReadFile(j);

            //Merge Sort Analysis
            MergeX[MergeIndex] = String.valueOf(j);
            MergeSortAlgorithm(MergeArray);
            MergeY[MergeIndex] = stepscounter;

            MergeIndex++;
        }

        return new GetAxis(MergeX, MergeY);
    }
}


