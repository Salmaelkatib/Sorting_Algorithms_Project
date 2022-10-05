package com.Algorithims;

import java.io.FileReader;
import java.io.IOException;

public class CountingSort {
    int n;

    public CountingSort(int n) {
        this.n = n;
    }
    public GetAxis Analysis() {
        String[] countingX = new String[n];             //elements of x-axis(CategoryAxis)
        long[] countingY = new long[n];                 //elements of y-axis(NumberAxis)
        int CountingIndex = 0;

        for (int j = 1; j <= n; j++) {
            //Fill array to be sorted
            int[] CountingArray = new ArrayGenerator(j).ReadFile(j);

            //Counting Sort Analysis
            countingX[CountingIndex] = String.valueOf(j);
            countingY[CountingIndex] = RunningTime(CountingArray);

            CountingIndex++;
        }

        return new GetAxis(countingX, countingY);
    }

    int getmax(int arr[], int size) {
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }

    int RunningTime(int arr[]) {
        int counter = 0;
        int n = arr.length;
        int output[] = new int[n];
        int countsize = getmax(arr, n)+1;
        int count[] = new int[countsize];

        for (int i = 0; i < countsize; i++) {
            count[i] = 0;
            counter ++;
        }
        for (int i = 0; i < n; i++){
            counter++;
            count[arr[i]]++;
        }

        for (int i = 1; i < countsize; i++){
            counter++;
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            counter++;
            --count[arr[i]];
            counter++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
            counter ++;
        }
        return counter;
    }
}
