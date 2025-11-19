/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto1;

import java.util.*;

/**
 *
 * @author Jonattan Rizo
 */

public class Punto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] palabras = {"java", 
            "programacion", 
            "computador", 
            "adivinanza", 
            "software", 
            "secreto", 
            "caballo",
            "pinguino",
            "anillo",
            "tapabocas",
            "chaqueta",
            "celular",
            "audifonos",
            "cuaderno"
        };
        
        Random rand = new Random();
        String palabraSecreta = palabras[rand.nextInt(palabras.length)];

        char[] palabraAdivinada = new char[palabraSecreta.length()];
        Arrays.fill(palabraAdivinada, '_');
        
        int intentos = 5;

        while (intentos > 0) {
            System.out.println("Palabra: " + new String(palabraAdivinada));
            System.out.println("Tienes " + intentos + " intentos restantes.");
            System.out.print("Introduce una letra o escribe la palabra completa: ");
            
            String entrada = scanner.nextLine();

            if (entrada.length() > 1) {
                if (entrada.equals(palabraSecreta)) {
                    System.out.println("Adivinaste la palabra");
                    break;
                } else {
                    intentos--;
                    System.out.println("Palabra incorrecta.");
                }
            } else {
                char letra = entrada.charAt(0);
                boolean letraCorrecta = false;
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        palabraAdivinada[i] = letra;
                        letraCorrecta = true;
                    }
                }

                if (!letraCorrecta) {
                    intentos--;
                    System.out.println("Letra incorrecta.");
                }
            }

            if (new String(palabraAdivinada).equals(palabraSecreta)) {
                System.out.println("Adivinaste la palabra");
                break;
            }
        }
        
        if (intentos == 0) {
            System.out.println("La palabra secreta era: " + palabraSecreta);
        }
    }
}
