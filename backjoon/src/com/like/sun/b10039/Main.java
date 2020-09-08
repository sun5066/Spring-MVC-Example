package com.like.sun.b10039;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] < 40) {
                intArray[i] = 40;
            }
            if (intArray[i] < 0 || intArray[i] > 100 && intArray[i] % 5 != 0) {
                i--;
                continue;
            }
        }

        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }

        System.out.println(sum / intArray.length);
    }
}
