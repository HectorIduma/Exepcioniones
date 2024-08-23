package com.mycompany.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String lectTeclado = scanner.nextLine();

        longString cadenaUtil = new longString();
        try {
            char caracter = cadenaUtil.caracterEn(lectTeclado, 7);
            System.out.println("El caracter en la posicion 7 es: " + caracter);
        } catch (Exception e) {
            System.out.println("La cadena de caracteres no es tan larga.");
        }
    }
}
