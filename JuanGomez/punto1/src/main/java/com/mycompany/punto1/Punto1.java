/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto1;

/**
 *
 * @author Juan Gomez
 */
import java.util.Scanner;
import java.util.Random;

public class Punto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Lista de palabras 
        String[] palabras = {"casa", "perro", "java", "teclado", "sol", "libro"};

        // Selección aleatoria
        String palabraSecreta = palabras[rand.nextInt(palabras.length)];

        // Estado del juego
        char[] adivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < adivinada.length; i++) {
            adivinada[i] = '_';
        }

        int intentos = 8; // número de intentos

        System.out.println("¡Adivina la palabra secreta!");
        
        while (intentos > 0) {
            System.out.println("\nPalabra: " + String.valueOf(adivinada));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            
            char letra = sc.next().toLowerCase().charAt(0);
            boolean acierto = false;

            // Verificar la letra
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra && adivinada[i] == '_') {
                    adivinada[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
            }

            // ¿Ganó?
            if (String.valueOf(adivinada).equals(palabraSecreta)) {
                System.out.println("\n¡Felicidades! Adivinaste la palabra: " + palabraSecreta);
                return;
            }
        }

        // Si se acaba el numero de oportunidades
        System.out.println("\nTe quedaste sin intentos. La palabra era: " + palabraSecreta);
    }
}
