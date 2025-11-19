/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaExamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class JavaExamen {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
  

        /* public class Main {*/ 
        /*    public static void main(String[] args) {*/   
      
        String[] palabras = {"fresa", "morir", "carlos", "infierno"};
        String secreta = palabras[new Random().nextInt(palabras.length)];

        char[] progreso = new char[secreta.length()];
        Arrays.fill(progreso, '_');

        int intentos = 5;
        Scanner sc = new Scanner(System.in);

        while (intentos > 0 && new String(progreso).contains("_")) {
            System.out.println("Palabra: " + String.valueOf(progreso));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");

            char letra = sc.next().toLowerCase().charAt(0);
            boolean acierto = false;

            for (int i = 0; i < secreta.length(); i++) {
                if (secreta.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) intentos--;
        }

        if (new String(progreso).contains("_")) {
            System.out.println("Perdio por loca, La palabra era: " + secreta);
        } else {
            System.out.println("Gano La palabra era: " + secreta);
        }
    }
}
