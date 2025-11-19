/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcadobasico;

import java.util.Scanner;

public class AhorcadoBasico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// palabra que el jugador debe adivinar
        String palabraSecreta = "saquenmedelatinoamerica";
        //ARREGLO PARA MOSTRAR EL PROCESO DE LA PALABRA :3
        char[] progresoArray = new char[palabraSecreta.length()];
        for (int i = 0; i < progresoArray.length; i++) {
            progresoArray[i] = '_';
        }
        // numero de intentos
        int intentos = 20;

        System.out.println("helouda a el the game del ahorcado");

        while (intentos > 0 && new String(progresoArray).indexOf('_') !=-1) {
// Mostrar la palabra con letras adivinadas
            System.out.println("Palabra: " + new String(progresoArray));
            System.out.println("Intentos restantes: " + intentos);
            // Pedir al jugador que ingrese una letra
            System.out.print("Ingresa una letra: ");
            char letra = sc.next().charAt(0);

            boolean encontrada = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    progresoArray[i] = letra;
                    encontrada = true;
                }
            }
            // Mensajes segun si la letra fue encontrada o no
            if (!encontrada) {
                intentos--;
                System.out.println("Esta no esta"); // perder un intento si la letra no esta
            } else {
                System.out.println("Exelente, esta esta");
            }

            System.out.println();
        }

        String progreso = new String(progresoArray); // Convertir el arreglo de progreso a String
        // Mostrar resultado final del juego
        if (progreso.equals(palabraSecreta)) {
            System.out.println("Nice, Adivinaste la palabra: " + palabraSecreta);
        } else {
            System.out.println("Perdio men, la palabra era: " + palabraSecreta);
        }

        sc.close();
    }
}
