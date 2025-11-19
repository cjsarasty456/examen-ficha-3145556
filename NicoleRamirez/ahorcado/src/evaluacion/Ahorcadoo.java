/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class Ahorcadoo {
     public static void main(String[] args) {
         
         /* se define arreglo con una opcion de palabras que se elegiran
         al azar para que el usuario las adivine*/
         String []palabras = {"carro", "taylor", "musica", "red", "reputation"};
         Random rad= new Random();
         
         // se generan las lineas con la cantidad de letras que tiene la palabra
         String palabra= palabras[rad.nextInt(palabras.length)];
         char[] progreso = new char[palabra.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }
       
        
        /* se definen los intentos y empieza el juego, 
        mietras los intentos sean mayores a cero, el usuario podra advinar la palabra*/
        int intentos = 8;
        Scanner sc = new Scanner(System.in);

        while (intentos > 0) {
            System.out.println("\nPalabra: " + String.valueOf(progreso));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingrese una letra: ");

            char letra = sc.next().toLowerCase().charAt(0);
            boolean acierto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra && progreso[i] == '_') {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) intentos--;
            
            // Se define si gano el usario 
            if (String.valueOf(progreso).equals(palabra)) {
                System.out.println("\n Ganaste La palabra era: " + palabra);
                return;
            }
        }
        // se le informa al usuario que perdion
        System.out.println("\nPerdiste. La palabra era: " + palabra);
    }
         
    
    
    
}
