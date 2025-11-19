/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.juegoppt;
import java.util.Random;
import java.util.Scanner;

public class JuegoPPT{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al juego Piedra, Papel o Tijera!");
        
        while (true) {
            System.out.println("\nElige tu jugada:");
            System.out.println("1 - Piedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tijera");
            System.out.println("4 - Salir del juego");
            System.out.print("Ingresa el número de tu opción: ");

           
            int opcionUsuario;
            if (scanner.hasNextInt()) {
                opcionUsuario = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa un número.");
                scanner.next(); 
                continue;
            }

            if (opcionUsuario == 4) {
                System.out.println("¡Gracias por jugar! .");
                break;
            }

            if (opcionUsuario < 1 || opcionUsuario > 3) {
                System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
                continue;
            }

           
           
            int opcionMaquina = random.nextInt(3) + 1;

            
            String jugadaUsuario = convertirOpcionATexto(opcionUsuario);
            String jugadaMaquina = convertirOpcionATexto(opcionMaquina);

            System.out.println("\nTu jugada: " + jugadaUsuario);
            System.out.println("Jugada de la máquina: " + jugadaMaquina);

            
            determinarGanador(opcionUsuario, opcionMaquina);
        }

        scanner.close();
    }


    public static String convertirOpcionATexto(int opcion) {
        switch (opcion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "Desconocido";
        }
    }



    public static void determinarGanador(int usuario, int maquina) {
        if (usuario == maquina) {
            System.out.println("¡Es un empate!");
        } else if ((usuario == 1 && maquina == 3) ||
                   (usuario == 2 && maquina == 1) || 
                   (usuario == 3 && maquina == 2)) { 
            System.out.println("¡Ganaste la partida!");
        } else {
            System.out.println("¡La máquina gana! Perdiste la partida.");
        }
    }
}
