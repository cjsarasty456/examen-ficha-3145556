package com.mycompany.ejerciciouno;

import java.util.Scanner;
import java.util.Random;

/**
 * Programa que permite adivinar una palabra secreta letra por letra.
 * Conceptos: cadenas, bucles, condicionales, control de estados.
 * Autor: Jhampier Santos Ortiz
 */
public class EjercicioUno {

    public static void main(String[] args) {
        String[] palabras = {"Inmadura", "Desinteres", "portatil", "leon", "algoritmo"};

        // Selección aleatoria de palabra
        Random rand = new Random();
        String palabraSecreta = palabras[rand.nextInt(palabras.length)];

        // Estado de la palabra adivinada
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_'; 
        }

        int intentos = 6; 
        Scanner scanner = new Scanner(System.in);
        boolean palabraCompleta = false;

        System.out.println("¡Bienvenido al juego del Ahorcado!");
        System.out.println("Tienes " + intentos + " intentos para adivinar la palabra.");

  
        while (intentos > 0 && !palabraCompleta) {
         
            System.out.print("Palabra: ");
            for (char c : palabraAdivinada) {
                System.out.print(c + " ");
            }
            System.out.println();

            
            System.out.print("Ingresa una letra: ");
            String entrada = scanner.nextLine().toLowerCase();

           
            if (entrada.length() != 1) {
                System.out.println("Por favor ingresa solo una letra.");
                continue;
            }

            char letra = entrada.charAt(0);
            boolean acierto = false;

            // Revisar si la letra está en la palabra secreta
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra && palabraAdivinada[i] == '_') {
                    palabraAdivinada[i] = letra;
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("Bien la letra está en la palabra.");
            } else {
                intentos--;
                System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
            }

            // Comprobar si la palabra se ha adivinado completamente
            palabraCompleta = true;
            for (char c : palabraAdivinada) {
                if (c == '_') {
                    palabraCompleta = false;
                    break;
                }
            }
        }

        
        if (palabraCompleta) {
            System.out.println("¡Felicidades! Adivinaste la palabra: " + palabraSecreta);
        } else {
            System.out.println("Se te acabaron los intentos. La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }
}
