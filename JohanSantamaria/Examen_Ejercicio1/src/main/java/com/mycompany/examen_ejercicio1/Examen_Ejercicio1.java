/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ejercicio1;
import java.util.Random;
import java.util.Scanner;

public class Examen_Ejercicio1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //Se crea un array para almacenar las palabras que puede tomar el programa aleatoriamente
        String[] palabras = {"telefono", "carro", "unico", "cama", "juego", "ahorcado"};

        String palabraAhorcado = palabras[random.nextInt(palabras.length)];

        char[] avance = new char[palabraAhorcado.length()]; //Se lee la longitud de la palabra escogida

        for (int i = 0; i < avance.length; i++) {
            avance[i] = '-';
        }

        int intentos = 6;

        System.out.println("Juego del ahorcado");
        System.out.println("Tienes " + intentos + " intentos para adivinar.");
        System.out.println("Palabra: " + String.valueOf(avance));

        while (intentos > 0) {

            System.out.print("\nIngresa una letra: ");
            //Se lee la letra ingresada y se convierte en minuscula
            char letra = scanner.next().toLowerCase().charAt(0);

            boolean adivinanza = false; //Se define la variable para determinar si es una respuesta valida o no

            //Validacion de letra, correcta o incorrecta
            for (int i = 0; i < palabraAhorcado.length(); i++) {
                if (palabraAhorcado.charAt(i) == letra) {
                    avance[i] = letra;
                    adivinanza = true;
                }
            }
            
            //Mensaje y conteo de intentos dependiendo de si esta bien o mal
            if (!adivinanza) {
                intentos = intentos - 1;
                System.out.println("Letra incorrecta. " + intentos + " intentos restantes.");
            } else {
                System.out.println("Letra correcta");
            }

            System.out.println("avance: " + String.valueOf(avance)); //Se muestra las letras conseguidas previamente

            if (String.valueOf(avance).equals(palabraAhorcado)) {
                System.out.println("\n🎉 Felicidades! Adivinaste la palabra: " + palabraAhorcado +" con "+intentos+" intentos restantes");
                return;
            }
        }

        System.out.println("\n Perdiste. La palabra era: " + palabraAhorcado);
    }
}
