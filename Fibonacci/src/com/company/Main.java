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
                int temp = last;
                last += first;
                first = temp;
            }
            for (int i = 0; i < x; i++) {
                int temp = first;
                first = last - temp;
                last = temp;
                System.out.print(last + " ");
            }
        }
    }
}
