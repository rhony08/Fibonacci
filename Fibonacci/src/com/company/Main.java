package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int first = 0;
        int last = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int x = scanner.nextInt();
        if (x > 0){
            for (int i = 0; i < x; i++) {
                System.out.print(last + " ");
                int temp = last;
                last += first;
                first = temp;
            }
        }
    }
}
