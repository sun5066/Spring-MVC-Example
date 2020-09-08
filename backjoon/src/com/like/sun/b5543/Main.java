package com.like.sun.b5543;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] < 100 || intArray[i] > 2000) {
                i--;
                continue;
            }
        }

        int temp = (intArray[0] > intArray[1]) ? intArray[1] : intArray[0];
        int hamburger = (temp > intArray[2]) ? intArray[2] : temp;
        int drink = (intArray[3] < intArray[4]) ? intArray[3] : intArray[4];

        System.out.println((hamburger + drink) - 50);
    }
}