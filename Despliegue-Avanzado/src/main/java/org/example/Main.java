package org.example;


public class Main {
    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 3;

        System.out.println("Suma: " + suma(numero1, numero2));
        System.out.println("Resta: " + resta(numero1, numero2));

    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
}
