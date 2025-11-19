/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ahorcado;
import java.util.*;
/**
 *
 * @author USUARIO
 */
public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // palabra que sera aleatorias
        String[] palabras = {"avion", "creeper", "dinosaurio", "rinoceronte", "magdalena"};

        // operacion aleatoria 
        String palabra = palabras[(int) (Math.random() * palabras.length)];

        // lo espacios 
        String progreso = "_".repeat(palabra.length());

        int intentos = 6;

        while (intentos > 0 && progreso.contains("_")) {
            System.out.println("Palabra: " + progreso);
            System.out.println("Intentos: " + intentos);
            System.out.print("Letra: ");

            char letra = sc.next().charAt(0);

            String nuevoProgreso = "";
            boolean acierto = false;

            // Revisar letra
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    nuevoProgreso += letra;
                    acierto = true;
                } else {
                    nuevoProgreso += progreso.charAt(i);
                }
            }

            progreso = nuevoProgreso;

            if (!acierto) {
                intentos--;
            }
        }

        // resultado
        if (progreso.equals(palabra)) {
            System.out.println("Ganaste! La palabra era: " + palabra);
        } else {
            System.out.println("Perdiste ! tontito La palabra era: " + palabra);
        }
    }
}



