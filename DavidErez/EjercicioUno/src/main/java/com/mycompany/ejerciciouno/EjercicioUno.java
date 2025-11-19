/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciouno;
        
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author nox
 */
public class EjercicioUno {

    public static void main(String[] args) {


        //se crea la llista con las palabras posibles
        String[] palabras = {"perro", "gato", "canica", "aguacate", "sandia"};
        
        // aca sees establece que la palabra creada anterior se coloque de manera ra dom
        Random random = new Random();
        String palabraRamdon = palabras[random.nextInt(palabras.length)];
        
        // numero de intentos
        
        int intentos = 6; 
        int intentosrestantes = intentos;
        boolean adivina = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("el ahorcado");
        
        //  con este while determinamos el flujo principal de el juego para que funcione mietras se tenga intentos
        while (intentosrestantes > 0 && !adivina) {
         
            System.out.println("intentos restantes: " + intentosRestantes);
            System.out.print("adivina una letra: ");
            
            char letra = sc.nextLine().toLowerCase().charAt(0);
            boolean acierto = false;
            

        
            
        
     
        // Resultado final
        if (adivina) {
            System.out.println("\n¡Felicidades! Adivinaste la palabra: " + palabraRamdon);
        } else {
            System.out.println("\n¡Te quedaste sin intentos! La palabra era: " + palabraRamdon);
        }
        
        
    }
    }


