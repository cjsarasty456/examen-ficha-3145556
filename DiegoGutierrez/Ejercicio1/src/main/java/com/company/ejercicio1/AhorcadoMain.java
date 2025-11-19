/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.ejercicio1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class AhorcadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();

        String[] palabras = {"computador","portatil","mouse", "teclado", "ram", "procesador"};
        // En este arreglo asignamos las distintas palabras disponibles para el juego.

        String palabraSecreta = palabras[random.nextInt(palabras.length)];
        // Acá mediante la selección de un número aleatorio se elige una palabra.

        char[] progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }
        // Primero se imprime un _ por cada carácter que contenga la palabra.
        
        System.out.println("¿Cuántos intentos crees necesitar?");
        int intentos = sc.nextInt();

        System.out.println("Adivina la palabra secreta!");
        System.out.println("Palabra: "+ String.valueOf(progreso));
        // Se muestran los carácteres que contiene la palabra.

        while (intentos > 0) {
            System.out.println("Ingresa una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);
            // Acá el programa lee un carácter que el usuario ingrese.

            boolean acierto = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    // Si el carácter ingresado coincide con alguno de la palabra, el acierto se vuelve verdadero.
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                // En el caso de que la variable 'acierto 'sea falsa.
                intentos -= 1;
                System.out.println("Letra incorrecta!");
                System.out.println("Te quedan "+ intentos +" intentos.");
            } else {
                // Si la variable 'acierto' es verdadera, significa que se adivinó una letra.
                System.out.println("Adivinaste una letra!");
            }

            System.out.println("Progreso: " + String.valueOf(progreso));

            if (String.valueOf(progreso).equals(palabraSecreta)) {
                // Si la palabra por adivinar coincide con la palabra, se da por ganado el juego.
                System.out.println("Adivinaste la palabra!");
                System.out.println(palabraSecreta);
                return;
                // El return; sirve para cancelar el ciclo while.
            }
        }

        System.out.println("Te quedaste sin intentos.");
        System.out.println("La palabra era: " + palabraSecreta);
    }
}