/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.punto9;

import java.util.*;

/**
 *
 * @author Jonattan Rizo
 */

public class Punto9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] palabras = {"Piedra", "Papel", "Tijeras"};
        
        Random rand = new Random();
        String maquina = palabras[rand.nextInt(palabras.length)];

        boolean ganadorMaquina = false;
        boolean ganadorJugador = false;
        
        while (!ganadorMaquina && !ganadorJugador) {
            System.out.print("Ingrese... Piedra, Papel o Tijeras: ");
            
            String entrada = scanner.nextLine();

            int valorJugador = convertirValor(entrada);

            if (valorJugador == -1) {
                System.out.println("Entrada no válida. Intenta nuevamente.");
                continue;
            }

            int valorMaquina = rand.nextInt(3) + 1;
            
            String maquinaJugada = convertirNombre(valorMaquina);

            System.out.println("La máquina eligió: " + maquinaJugada);
            
            if (valorJugador == valorMaquina) {
                System.out.println("Empate, siguen jugando.");
            } else if ((valorJugador == 1 && valorMaquina == 2) || 
                       (valorJugador == 2 && valorMaquina == 3) || 
                       (valorJugador == 3 && valorMaquina == 1)) {
                System.out.println("Perdiste");
                ganadorMaquina = true;
            } else {
                System.out.println("Ganaste");
                ganadorJugador = true;
            }
        }

    }

    // En caso tal de que se haya escrito numeros o la palabra completa en minuscula lo que hace es devolver un numero
    public static int convertirValor(String entrada) {
        String jugada = entrada.toLowerCase();
        if (jugada.equals("piedra")) {
            return 1;
        } else if (jugada.equals("papel")) {
            return 2;
        } else if (jugada.equals("tijeras")) {
            return 3;
        } else {
            return -1;
        }
    }
    
    // Luego de convertir el valor a numero entonces se comprar y retorla el valor correcto y bien escrito de la jugada que se quiso realizar
    public static String convertirNombre(int valor) {
        if (valor == 1) {
            return "Piedra";
        } else if (valor == 2) {
            return "Papel";
        } else if (valor == 3) {
            return "Tijeras";
        } else {
            return "Desconocido";
        }
    }
}
