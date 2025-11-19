/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ahorcado;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author thiag
 */

public class Ahorcado {

    public static void main(String[] args) {

        Scanner ahorcado = new Scanner(System.in);
        Random random = new Random();
        //Aqui arriba estamos creando      del sccaner para que el usuario pueda interactuar con el sistema 
        int intentos = 10; //Decimos los intentos para busvar la palabra
        System.out.println("Tienes " + intentos + " para poder adivinar la palabra ");
        
        
        String[] palabras = {"computador", "examen", "ahorcado", "programa", "profesor"};
        //Creamos un conjunto de palabras para que el sistema elija una al azar
              
        String palabra = palabras[random.nextInt(palabras.length)];
        //Con esto lo que hacemos es que coje una palabra al azar del arreglo que hicimos arriba y la guada en esa variable
        
        char[] progreso = new char[palabra.length()];
        //declaramos el array del progreso de la busqueda de la palabra 
        
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }
        //Este ciclo hace que nos vaya indicando en consola las letras escritas y la linea para ubicar donde va cada letra
        
        boolean palabraAdivinada = false;
        //Aqui con esta variable en bolean se pone para poder hacer el while cuando la palabra no este adivinada
        while (intentos > 0 && !palabraAdivinada) {
            System.out.println("\nPalabra: " + String.valueOf(progreso));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = ahorcado.next().toLowerCase().charAt(0);
            //En este while es donde se va mostrar y se repetira hasta que la palbra sea adivinada o pierda sus intentos
            
            boolean acierto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }
            //Esta parte es lo mimso se usa para cuando la letra que pone es correcta se usa el for para que recorra la palabra y compruebe

            if (!acierto) {
                intentos--;
                System.out.println("La letra no esta en la palabra");
            } else {
                System.out.println("La letra esta en la palabra");
            }
            //Aqui para cuando acierte y no acierte la letra de la palabra 
            if (String.valueOf(progreso).equals(palabra)) {
                palabraAdivinada = true;
            }
        }
        // Este es para comparar si la palabra que ha estado adivinando es la misma que la palabra que elijio el sistema 

        if (palabraAdivinada) {
            System.out.println("Felicidades adivinaste la palabra: " + palabra);
        } else {
            System.out.println("Te quedaste sin intentos la palabra era: " + palabra);
        }
        //Mensajes por si adivino la palabra al completo o no alcanzo a terminar 
    }
}
