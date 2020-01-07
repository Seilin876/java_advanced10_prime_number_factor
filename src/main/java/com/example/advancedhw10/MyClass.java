package com.example.advancedhw10;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PrimeNumber[] = new int[1000];
        int prime[] = new int[1000];
        int primecount = 0;
        System.out.println("請輸入一欲進行質因數分解的整數:");
        int InputInteger = Integer.parseInt(scanner.next());
        for (int i = 1; i <= InputInteger; i++) {
            int PrimeNumberJudge = 0;
            for (int j = 1; j <= InputInteger; j++) {
                if (i % j == 0) {
                    PrimeNumberJudge++;
                }
                if (PrimeNumberJudge > 2) {
                    break;
                }
            }
            if (PrimeNumberJudge == 2) {
                PrimeNumber[primecount] = i;
                primecount++;
            }
        }
        int FindFactors = InputInteger;
        int countN = 0;
        int FactorsNumberCount = 0;
        while (FindFactors != 1) {
            if (FindFactors % PrimeNumber[countN] == 0) {
                prime[FactorsNumberCount] = PrimeNumber[countN];
                FactorsNumberCount++;
                FindFactors /= PrimeNumber[countN];
            } else {
                countN++;
            }
        }
        System.out.printf("%d可被質因數分解為:\n", InputInteger);
        for (int i = 0; i < FactorsNumberCount; i++) {
            System.out.print(prime[i] + " ");
        }
    }
}