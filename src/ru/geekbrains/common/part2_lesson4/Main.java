package ru.geekbrains.common.part2_lesson4;

import org.omg.PortableInterceptor.SUCCESSFUL;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        masIn();
        massiv();
        masMas();
        massiveQ(5);
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));

    }
    

    public static void masIn() {
        int[] myArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int size = myArr.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = myArr[i];
            myArr[i] = myArr[size - 1 - i];
            myArr[size - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(myArr));
    }

    public static void massiv() {
        int[] intMass = new int[100];
        for (int i = 0; i < 100; i++) {
            intMass[i] = i + 1;
        }
        System.out.println(Arrays.toString(intMass));
    }

    public static void masMas() {
        int[] masInt = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < masInt.length; i++) {
            if (masInt[i] < 6) {
                masInt[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(masInt));
    }

    public static int[][] massiveQ(int n) {
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    mas[i][j] = 1;
                    System.out.print(" " + mas[i][j] );
                }
             }
        }
        return mas;
    }

    public static boolean checkBalance(int[] arr) {
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        if (summa % 2 != 0){
            return false;
        }
        int summLeft = 0;
        int i = 0;
        while (summLeft < summa / 2) {
            summLeft += arr[i];
            i++;
        }
        return summLeft == summa / 2;
        }
}