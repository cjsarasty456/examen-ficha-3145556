/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado{

    public static void main(String[] args) {
        String[] palabras = {"java", "programacion", "computadora", "algoritmo", "desarrollo"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = palabras[random.nextInt(palabras.length)]; // generamos una variable que cuente cada letra de las palabras 
        
        int intentos = 6;
        
        StringBuilder palabraMostrada = new StringBuilder(palabraSecreta.length()); // utilizamos el metodo de la StringBuildier por el conteo de las letras 
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraMostrada.append("_");// este append lo que hace es generar ese "_" es añadir un elemento al final de lo que pongamos  sin eliminar el contenido anterior
        }
        while (intentos > 0 && palabraMostrada.toString().contains("_")) {// aqui generamos un bucle que cuenta con la condicional de los intentos 
            System.out.println("Palabra: " + palabraMostrada);
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Introduce una letra: ");
            String letra = scanner.nextLine().toLowerCase();

            if (letra.length() != 1) {
                System.out.println("Introduce una sola letra.");
                continue;
            }
            boolean letraEncontrada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra.charAt(0)) {
                    palabraMostrada.setCharAt(i, letra.charAt(0));
                    letraEncontrada = true; // en este bucle que tiene anidado un if generamos la secuencia que valida si  las letras ingresadas coinciden con la palabra ramdomisada
                }
            }
            if (!letraEncontrada) {
                intentos--;
                System.out.println("La letra no está en la palabra.");
            }
        }
        if (palabraMostrada.toString().contains("_")) {
            System.out.println("¡Perdiste! La palabra era: " + palabraSecreta);
        } else {
            System.out.println("¡Felicidades! ¡Adivinaste la palabra: " + palabraSecreta);
        }

        scanner.close();
    }
}
