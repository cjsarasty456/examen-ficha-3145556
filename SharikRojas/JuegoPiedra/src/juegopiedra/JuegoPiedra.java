/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegopiedra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JuegoPiedra {
    
    
    Random random = new Random();
       
       // Se guarda las palabras en el arreglo
       String opcionesMaquina[] = {"Piedra", "Papel", "Tijera"};
       String opcionMaquina = opcionesMaquina[random.nextInt(opcionesMaquina.length)];
       
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite el numero de la opcion que quiera\n");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        int opcion = sc.nextInt();
        
        System.out.println("el que escogiste fue "+opcion);
        
        
        
    }
    
}
