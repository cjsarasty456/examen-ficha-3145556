/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        String[] opciones = {"Piedra", "Papel", "Tijera"};
               
        byte puntosUsuario = 0;
        byte puntosSistema = 0;
        
        // Opciones para escoger
        System.out.println("0. Piedra");
        System.out.println("1. Papel");
        System.out.println("2. Tijera");
        
        while (puntosUsuario != 3 && puntosSistema != 3) {
            // El sistenma (contra quien se va a jugar) escoge un numero del 0 al 3
            int sistema = rand.nextInt(3);
            
            // El usuario escoge un opcion
            System.out.println("Escoge una opcion:");
            int usuario = sc.nextInt();
        
            // Validacion, de acuerdo al juego
            if (sistema == usuario) {
                System.out.println("Empate\n");
            } else if ((sistema == 0 && usuario == 1) || (sistema == 1 && usuario == 2) || (sistema == 2 && usuario == 0)) {
                System.out.println("Ganas\n");
                puntosUsuario ++;
            } else if ((sistema == 0 && usuario == 2) || (sistema == 1 && usuario == 0) || (sistema == 2 && usuario == 1)) {
                System.out.println("Pierdes\n");
                puntosSistema++;
            } else {
                System.out.println("Numero invalido. Debe ser una de las opciones ");
            }
        }
        
        if (puntosUsuario == 3) {
            System.out.println("Felicidades Ganaste.");
            System.out.println("Puntos Usuario: " + puntosUsuario);
            System.out.println("Puntos Sistema: " + puntosSistema);
        } else {
            System.out.println("Perdiste.");
            System.out.println("Puntos Sistema: " + puntosSistema);
            System.out.println("Puntos Usuario: " + puntosUsuario);
        }
        
        sc.close();
    }
}