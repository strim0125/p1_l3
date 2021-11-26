package ru.geekbrains.common.part2_lesson4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        masIn();
        massiv();
    }

    public static void masIn() {
            int[] myArr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
            int size = myArr.length;
            for (int i = 0; i < size / 2; i++) {
                int temp = myArr[i];
                myArr[i] = myArr[size - 1 - i];
                myArr[size - 1 - i] = temp;
            }
            System.out.println(Arrays.toString(myArr));
        }

    public static void massiv(){
        int[] intMass = new int[100];
        for (int i = 0; i < 100; i++) {
            intMass[i] = i + 1;
        }
        System.out.println(Arrays.toString(intMass));
    }
}