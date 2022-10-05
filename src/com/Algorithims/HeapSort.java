package com.Algorithims;

import java.io.FileReader;
import java.io.IOException;

public class HeapSort {
    int n;

    public HeapSort(int n) {
        this.n = n;
    }

    public GetAxis Analysis() {
        String[] HeapX = new String[n];             //elements of x-axis(CategoryAxis)
        long[] HeapY = new long[n];                 //elements of y-axis(NumberAxis)
        int HeapIndex = 0;

        for (int j = 1; j <= n; j++) {
            counter=0;
            //Fill array to be sorted
            int[] HeapArray = new ArrayGenerator(j).ReadFile(j);

            //Heap Sort Analysis
            HeapX[HeapIndex] = String.valueOf(j);
            HeapY[HeapIndex] = heapSort(HeapArray,j);

            HeapIndex++;
        }

        return new GetAxis(HeapX, HeapY);
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int counter=0;
    int heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int NumOfSteps=0;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        NumOfSteps++;

        if (r < n && arr[r] > arr[largest])
            largest = r;
        NumOfSteps++;

        if (largest != i) {
            swap(arr, i, largest);

            heapify(arr, n, largest);
            NumOfSteps++;
        }
        return NumOfSteps;

    }

    int heapSort(int arr[], int n) {

        for (int i = n / 2 - 1; i >= 0; i--) {
            counter=counter+heapify(arr, n, i);
            counter++;
        }
        for (int i = n - 1; i >= 0; i--) {

            swap(arr, 0, i);

            counter=counter+heapify(arr, i, 0);
            counter++;
        }
        return counter;
    }
}
