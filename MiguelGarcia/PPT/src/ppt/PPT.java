/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ppt;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
import java.util.Random;

public class PPT {

    // Con esteme todo para convierto mi numero en el nombre de mi jugada
    public static String jugada(int opcion) {
        switch (opcion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "Opcion no invalida";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Elige una opcion: ");

        int jugador = sc.nextInt();

        // Validamos la entrada
        if (jugador < 1 || jugador > 3) {
            System.out.println("Opcion invalida,tienes elegir entre 1 y 3.");
            return;
        }

        // Aqui declaramos a nuestro rival
        int rival = random.nextInt(3) + 1;

        System.out.println("Jugador elige: " + jugada(jugador));
        System.out.println("Rival elige: " + jugada(rival));

        // Determinamos quien es el ganador
        if (jugador == rival) {
            System.out.println("Resultado: Empate");
        } else if (
                (jugador == 1 && rival == 3) ||  // Piedra le gana al Tijera
                (jugador == 2 && rival == 1) ||  // Papel le gana al Piedra
                (jugador == 3 && rival == 2)     // Tijera le gana al Papel
        ) {
            System.out.println("Resultado: WIN");
        } else {
            System.out.println("Resultado: LOL");
        }

        sc.close();
    }
}

