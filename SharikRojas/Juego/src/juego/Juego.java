/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Juego {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       // Se da la orden de que se va a relizar una seleccion random escogido por la maquina 
       Random random = new Random();
       
       // Se guarda las palabras en el arreglo
       String palabras[] = {"Programacion", "Sena", "Computador", "coco", "git"};
       String palabra = palabras[random.nextInt(palabras.length)];

        int intentos = 6;
        
        while (intentos>0){
            System.out.println("Digite la letra");
            
        }
    }
    
}
