/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Asus
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Elige (0-Piedra, 1-Papel, 2-Tijera): ");
        int jugador = sc.nextInt();
        int maquina = rand.nextInt(3);
        
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println("Tú eliges: " + opciones[jugador]);
        System.out.println("La máquina elige: " + opciones[maquina]);
        
        if (jugador == maquina) {
            System.out.println("Empate");
        } else if ((jugador == 0 && maquina == 2) || (jugador == 1 && maquina == 0) || (jugador == 2 && maquina == 1)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste.");
        }
    }
}

