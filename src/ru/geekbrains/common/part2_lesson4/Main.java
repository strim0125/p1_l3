package ru.geekbrains.common.part2_lesson4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        masInit();
    }

    public static void masInit() {
            int[] myArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
            int size = myArray.length;
            for (int i = 0; i < size / 2; i++) {
                int temp = myArray[i];
                myArray[i] = myArray[size - 1 - i];
                myArray[size - 1 - i] = temp;
            }
            System.out.println("Array after reverse:: ");
            System.out.println(Arrays.toString(myArray));
        }
}