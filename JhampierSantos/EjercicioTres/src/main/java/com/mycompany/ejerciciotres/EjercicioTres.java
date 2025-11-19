


package com.mycompany.ejerciciotres;

import java.util.Scanner;

/**
 * Conversor de grados Celsius a Fahrenheit
 * Descripción:
 * Pide al usuario una temperatura en Celsius y la convierte a Fahrenheit usando:
 * F = C × 9/5 + 32
 * Puntos para practicar:
 * Manejo de variables
 * Operaciones matemáticas simples
 * @author jhampier
 */
public class EjercicioTres {

    public static void main(String[] args) {
        // Objeto
        Scanner scanner = new Scanner(System.in);

        // Peticion
        System.out.print("ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        //resultado
        System.out.println(celsius + " ° C son " + fahrenheit + " ° F");
        scanner.close();
    }
}
