package org.example;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma;

        System.out.println("Ingrese el primer numero (menor)");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero (mayor)");
        num2 = scanner.nextInt();

        suma = 0;
        for (int i = num1+1; i <num2 ; i++) {
            suma = suma + i;
            System.out.print(i);
            if (i != num2-1){
                System.out.print(" + ");
            }

        }
        System.out.println(" = " + suma);
    }
}
