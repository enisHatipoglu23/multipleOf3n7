package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        //
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++){
            if ((i % 3 == 0) && (i % 7 == 0)){
                System.out.print(i + " ");
            }
        }
    }
}
