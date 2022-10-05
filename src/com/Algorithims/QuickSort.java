package com.Algorithims;

import java.io.FileReader;
import java.io.IOException;

public class QuickSort {
    int n;
  int counter=0;
    public QuickSort(int n) {
        this.n = n;
    }


    public GetAxis Analysis() {
        String[] QuickX = new String[n];             //elements of x-axis(CategoryAxis)
        long[] QuickY = new long[n];                 //elements of y-axis(NumberAxis)
        int QuickIndex = 0;

        for (int j = 1; j <= n; j++) {
            counter=0;
            //Fill array to be sorted
            int[] QuickArray = new ArrayGenerator(j).ReadFile(j);

            //Quick Sort Analysis
            QuickX[QuickIndex] = String.valueOf(j);
            QuickY[QuickIndex] = quickSort(QuickArray,0,j-1);

            QuickIndex++;
        }
        return new GetAxis(QuickX, QuickY);
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] partition(int[] arr, int low, int high) {
        int NumOfSteps=0;
        int []A=new int[2];
        int pivot = arr[high];
        int i = (low - 1);
        NumOfSteps=+2;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                NumOfSteps=+3;
            }
            NumOfSteps++;
        }
        swap(arr, i + 1, high);  NumOfSteps++;
        A[0]=(i+1);A[1]=NumOfSteps;
        return A;
    }

     int quickSort(int[] arr, int low, int high) {
        counter++;
        if (low < high) {
            int []B= partition(arr, low, high);
            int pi = B[0];
            counter=counter+B[1];
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return counter;
    }
}
