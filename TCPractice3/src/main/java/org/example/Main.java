package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2 =2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero para determinar si es divisible por 2:");
        num1 = sc.nextInt();

        if(num1 % num2 == 0){
            System.out.println(num1 + " es divisible por 2.");
        }
        else{
            System.out.println(num1 + " no es divisible por 2.");
        }
    }
}