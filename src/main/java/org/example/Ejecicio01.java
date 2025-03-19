package org.example;

import java.util.Scanner;

public class Ejecicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("INGRESE UN NUMERO ENTERO:");
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

    }
}