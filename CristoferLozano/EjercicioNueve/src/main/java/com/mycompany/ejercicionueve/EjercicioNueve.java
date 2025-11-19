/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicionueve;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class EjercicioNueve {
    
    // Constantes de opciones para jugar
    private static final int PIEDRA = 1;
    private static final int PAPEL = 2;
    private static final int TIJERA = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Que inicie el juego");
        System.out.println();

        boolean jugarOtraVez = true;

        while (jugarOtraVez) {
            //imprimir opciones 
            System.out.println("Elige tu opcion:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.print("Ingresa tu eleccion: ");

            //leer opcion elegida
            int eleccionUsuario = scanner.nextInt();

            //validacion para que no sea menor a 1 y mayor a 3
            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                System.out.println("Error: Debes elegir 1, 2 o 3.");
                continue;
            }

            //numero aleatorio que representa la eleccion de la maquina
            int eleccionMaquina = random.nextInt(3) + 1;

            //mostrar lo jugado
            System.out.println("\nTu eleccion: " + convertirN(eleccionUsuario));
            System.out.println("Maquina: " + convertirN(eleccionMaquina));
            System.out.println();

            //quien gano
            String resultado = quienGano(eleccionUsuario, eleccionMaquina);
            System.out.println("Resultado: " + resultado);
            System.out.println();

            //jugar de nuevo?
            System.out.print("Quieres jugar otra vez (s/n): ");
            String respuesta = scanner.next().toLowerCase();

            if (!respuesta.equals("s") && !respuesta.equals("si")) {
                jugarOtraVez = false;
            }
            System.out.println();
        }

        System.out.println("gracias por jugar al mejor juego de piedra papel y tijeras super innovador 3000");
        scanner.close();
    }
    
    //metodo para convertir el nombre
    public static String convertirN(int opcion) {
        switch (opcion) {
            case PIEDRA:
                return "Piedra";
            case PAPEL:
                return "Papel";
            case TIJERA:
                return "Tijera";
            default:
                return "elija una opcion valida";
        }
    }

    //metodo para determinar el ganador
    public static String quienGano(int usuario, int maquina) {
        //por si hay empate
        if (usuario == maquina) {
            return "empataste con la maquina";
        }

        // Lógica del juego
        switch (usuario) {
            case PIEDRA:
                return (maquina == TIJERA) ? "Ganaste, eres super pro" : "tal vez la proxima jaja";
            case PAPEL:
                return (maquina == PIEDRA) ? "Ganaste, la bestia" : "Perdiste, intentalo de nuevo";
            case TIJERA:
                return (maquina == PAPEL) ? "Ganaste, el mas duro de ADSO *fueguito*" : "Perdiste, nonono";
            default:
                return "Error en la determinación del ganador";
        }
    }
}

