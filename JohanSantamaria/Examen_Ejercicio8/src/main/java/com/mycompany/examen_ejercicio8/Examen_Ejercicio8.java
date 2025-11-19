/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ejercicio8;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Smith
 */
public class Examen_Ejercicio8 {
    
    // Método para convertir número a texto
    public static String convertir(int opcion) {
        if (opcion == 1) return "Piedra";
        if (opcion == 2) return "Papel";
        if (opcion == 3) return "Tijera";
        return "";
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Piedra, papel o tijeras");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Elige una opción: ");
        
        int jugador = sc.nextInt();
        
        if (jugador < 1 || jugador > 3) {
            System.out.println("Opción inválida.");
            return;
        }
        
        int maquina = random.nextInt(3) + 1;
        
        System.out.println("\nTú elegiste: " + convertir(jugador));
        System.out.println("El pc eligió: " + convertir(maquina));
        
        if (jugador == maquina) {
            System.out.println("\nResultado: EMPATE");
        }
        //Se ponen los casos en los que el jugador gana
        else if ((jugador == 1 && maquina == 3) ||   
                 (jugador == 2 && maquina == 1) ||   
                 (jugador == 3 && maquina == 2)) {   
            System.out.println("\nResultado: GANASTE");
        } 
        else {
            System.out.println("\nResultado: PERDISTE");
        }
    }
}
