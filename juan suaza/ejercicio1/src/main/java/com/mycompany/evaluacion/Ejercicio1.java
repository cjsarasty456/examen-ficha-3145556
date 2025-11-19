/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacion;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Ejercicio1 {


public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = "java";
        ArrayList<Character> letrasAdivinadas = new ArrayList<>();
        int intentos = 6;
        
        while (intentos > 0) {
            boolean adivinada = true;
            System.out.println("Palabra: ");
            
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (letrasAdivinadas.contains(palabraSecreta.charAt(i))) {
                    System.out.print(palabraSecreta.charAt(i) + " ");
                } else {
                    System.out.print("_ ");
                    adivinada = false;
                }
            }
            
            System.out.println("\nIntentos restantes: " + intentos);
            
            if (adivinada) {
                System.out.println("¡Has adivinado la palabra!");
                break;
            }
            
            System.out.print("Introduce una letra: ");
            char letra = sc.next().charAt(0);
            
            if (!palabraSecreta.contains(String.valueOf(letra))) {
                intentos--;
            } else {
                letrasAdivinadas.add(letra);
            }
        }
        
        if (intentos == 0) {
            System.out.println("Has perdido. La palabra era: " + palabraSecreta);
        }
    }
}

}

