/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package piedrapapelytijeras;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelYTijeras {

    // Método que convierte un número en piedra, papel o tijera
    public static String convertir(int opcion) {
        return switch (opcion) {
            case 1 -> "Piedra";
            case 2 -> "Papel";
            case 3 -> "Tijera";
            default -> "error";
        };
    }

    // Método que determina el ganador
    public static String resultado(int jugador, int maquina) {
        if (jugador == maquina) {
            return "Es un empate";
        }

        if ((jugador == 1 && maquina == 3) ||  // Piedra vence a Tijera
            (jugador == 2 && maquina == 1) ||  // Papel vence a Piedra
            (jugador == 3 && maquina == 2)) {  // Tijera vence a Papel
            return "Gano";
        }

        return "Perdio";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("---- JUEGO: PIEDRA, PAPEL O TIJERA ----");
        System.out.println("Elija una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Su elección es: ");
        
        int jugador = sc.nextInt();

        if (jugador < 1 || jugador > 3) {
            System.out.println("Opción erronea. Debe ser 1, 2 o 3.");
            return;
        }

        int maquina = rnd.nextInt(3) + 1;

        System.out.println("Tú elegiste: " + convertir(jugador));
        System.out.println("La máquina eligió: " + convertir(maquina));

        System.out.println("Resultado: " + resultado(jugador, maquina));
    }
}
