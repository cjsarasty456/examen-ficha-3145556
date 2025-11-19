/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio09;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("PIEDRA, PAPEL O TIJERA");
        System.out.println("Elige una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Tu elección: ");

        int opcionUsuario = sc.nextInt();

        if (opcionUsuario < 1 || opcionUsuario > 3) {
            System.out.println("Debe elegir 1, 2 o 3.");
            return;
        }

        String[] opciones = {"Piedra", "Papel", "Tijera"};
        String jugador = opciones[opcionUsuario - 1];

      
        int opcionMaquina = (int) (Math.random() * 3); 
        String maquina = opciones[opcionMaquina];

        System.out.println("Tú elegiste: " + jugador);
        System.out.println("La máquina eligió: " + maquina);

      
        if (jugador.equals(maquina)) {
            System.out.println("\nResultado: ¡Empate!");
        } 
        else if (
            (jugador.equals("Piedra") && maquina.equals("Tijera")) ||
            (jugador.equals("Papel") && maquina.equals("Piedra")) ||
            (jugador.equals("Tijera") && maquina.equals("Papel"))
        ) {
            System.out.println("resultado: Ganaste");
        } 
        else {
            System.out.println("resultado: Perdiste");
        }
    }
}
