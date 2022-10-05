package com.Algorithims;

import java.io.*;

public class ArrayGenerator {
    int n;

    public ArrayGenerator(int n) {
        this.n = n;
        }

    public void GenerateArray(int n) {
        try {
        PrintWriter MyFile = new PrintWriter(new BufferedWriter(new FileWriter("Array.txt")));
        int min = 1;
        int max = n;
        for (int i = 0; i < n; i++) {
            int RandomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
            MyFile.println(RandomNum);
        }
            MyFile.close();

    } catch (IOException e) {
            e.printStackTrace();    }
    }

    public int[] ReadFile(int n){
        int[] Array =new int[n];
        try {
            FileReader reader = new FileReader("Array.txt");
            for(int i=0;i< n;i++)
                Array[i] = reader.read();

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Array;
    }
}





