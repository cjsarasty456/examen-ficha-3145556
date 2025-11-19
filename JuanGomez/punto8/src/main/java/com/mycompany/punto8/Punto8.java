/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto8;

/**
 *
 * @author Juan Gomez
 */
import java.util.Scanner;
import java.util.Random;

public class Punto8 {

    public static String convertir(int num) {
        if (num == 1) return "Piedra";
        else if (num == 2) return "Papel";
        else if (num == 3) return "Tijera";
        else return "No valido";
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Juego Piedra Papel o Tijera");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Digite su opcion: ");
        int jugador = teclado.nextInt();

        int maquina = aleatorio.nextInt(3) + 1;

        System.out.println("Usted eligio: " + convertir(jugador));
        System.out.println("La maquina eligio: " + convertir(maquina));

        if (jugador == maquina) {
            System.out.println("Empate");
        } else if (jugador == 1 && maquina == 3) {
            System.out.println("Usted gano");
        } else if (jugador == 2 && maquina == 1) {
            System.out.println("Usted gano");
        } else if (jugador == 3 && maquina == 2) {
            System.out.println("Usted gano");
        } else {
            System.out.println("Usted perdio");
        }

        teclado.close();
    }
}
