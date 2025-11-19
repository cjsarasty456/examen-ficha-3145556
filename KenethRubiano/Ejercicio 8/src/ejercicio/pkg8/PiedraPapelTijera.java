/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

/**
 *
 * @author SoporteSENA
 */
import java.util.Scanner;

public class PiedraPapelTijera {

    public static String convertir(int opcion) {
        if (opcion == 1) return "Piedra";
        if (opcion == 2) return "Papel";
        return "Tijera";
    }
/* opciones*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elija una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        int jugador = sc.nextInt();

        /* la maquina selecciona al azar */
        int maquina = (int)(Math.random() * 3) + 1;

        System.out.println("Jugador: " + convertir(jugador));
        System.out.println("Máquina: " + convertir(maquina));

        if (jugador == maquina) {
            System.out.println("Empate");
        } 
        else if ((jugador == 1 && maquina == 3) ||
                 (jugador == 2 && maquina == 1) ||
                 (jugador == 3 && maquina == 2)) {
            System.out.println("Ganaste");
        } 
        else {
            System.out.println("Perdiste");
        }
    }
}
