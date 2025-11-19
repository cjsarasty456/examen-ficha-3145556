package com.mycompany.ejercicionueve;

import java.util.Scanner;
import java.util.Random;

/**
 *Descripción del Ejercicio: Piedra, Papel o Tijera
El aprendiz debe desarrollar un programa en Java que simule el clásico juego
“Piedra, Papel o Tijera”. El programa debe permitir que el usuario seleccione una
de las tres opciones posibles y, de manera aleatoria, el sistema debe generar la
opción de la máquina. Luego, el programa debe comparar ambas elecciones y
determinar el resultado de la partida, indicando si el jugador gana, pierde o
empata.
• El ejercicio requiere que el aprendiz implemente:
• Lectura de datos desde teclado.
• Generación de valores aleatorios.
• Uso de condicionales para determinar el ganador.
• Un método adicional que permita convertir los valores numéricos en nombres
(piedra, papel o tijera).
• Buena organización del código, siguiendo principios básicos de programación.
• El propósito del ejercicio es reforzar la lógica de decisión, el manejo de entradas
del usuario, el uso de funciones y la estructura general de un programa
interactivo en Java
 * @author jhampier
 */
public class EjercicioNueve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido a Piedra Papel o Tijera!");
        System.out.println("Elige una opcion:");
        System.out.println("0: Piedra");
        System.out.println("1: Papel");
        System.out.println("2: Tijera");

        int jugador;
        while (true) {
            System.out.print("Ingresa tu eleccion (0, 1 o 2): ");
            jugador = scanner.nextInt();
            if (jugador >= 0 && jugador <= 2) {
                break;
            } else {
                System.out.println("no sabes leer ahi mismo te esta diciendo que opcion debes escoger");
            }
        }

        int maquina = random.nextInt(3);

        System.out.println("Tu eleccion: " + convertirEleccion(jugador));
        System.out.println("Eleccion de la maquina: " + convertirEleccion(maquina));

        if (jugador == maquina) {
            System.out.println("Empate");
        } else if ((jugador == 0 && maquina == 2) || 
                   (jugador == 1 && maquina == 0) || 
                   (jugador == 2 && maquina == 1)) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste malo");
        }

       
    }
//Metodo
    public static String convertirEleccion(int opcion) {
        switch (opcion) {
            case 0:
                return "Piedra";
            case 1:
                return "Papel";
            case 2:
                return "Tijera";
            default:
                return "no sabes leer ahi mismo te esta diciendo que opcion debes escoger";
        }
    }
}
