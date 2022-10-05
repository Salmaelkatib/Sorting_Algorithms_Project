package com.Algorithims;

import java.io.FileReader;
import java.io.IOException;

public class BubbleSort {
    int n;

    public BubbleSort(int n) {
        this.n = n;
    }

    public GetAxis Analysis() {
        String[] BubbleX = new String[n];             //elements of x-axis(CategoryAxis)
        long[] BubbleY = new long[n];                 //elements of y-axis(NumberAxis)
        int BubbleIndex = 0;

        for (int j = 1; j <= n; j++) {
            //Fill array to be sorted
            int[] BubbleArray = new ArrayGenerator(j).ReadFile(j);

            //Bubble Sort Analysis
            int NumOfSteps = RunningTime(BubbleArray);
            BubbleX[BubbleIndex] = String.valueOf(j);
            BubbleY[BubbleIndex] = NumOfSteps;

            BubbleIndex++;
        }

        return new GetAxis(BubbleX, BubbleY);
    }

    public int RunningTime(int[] a)
    {
        int counter=0;
        int i=0;
        int j=0;
        int n=a.length;
        int temp=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-1);j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    counter++;
                }
            }
        }
        return counter;
    }

}
