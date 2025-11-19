/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciouno;

import com.mycompany.ejerciciouno.models.Palabras;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class EjercicioUno {

    public static void main(String[] args) {
        //Seleccionar palabra al azar de la clase Palabras ubicada en models
        String PalabraEnJuego = Palabras.PalabraRandom();
        
        //informe del estado de juego (palabras adivinadas, incorrectas)
        Set<Character> Adivinadas = new HashSet<>();
        Set<Character> Incorrectas = new HashSet<>();
        //cantidad de intentos y cuantos quedan
        int Intentos = 6;
        int IntentosRestantes = Intentos;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("La palabra tiene " + PalabraEnJuego.length() + " letras.");
        System.out.println("Tienes " + Intentos + " intentos para adivinarla.");
        
        //ciclo while para la logica del juego
        while (IntentosRestantes > 0 && !palabraCompleta(PalabraEnJuego, Adivinadas)){
            
            mostrarActual(PalabraEnJuego, Adivinadas);
            System.out.println("Letras incorrectas: " + Incorrectas);
            System.out.println("Intentos restantes: " + IntentosRestantes);
            
            System.out.print("Ingresa una letra: ");
            String entrada = scanner.nextLine().toUpperCase().trim();
            
            //Validacion del tipo de dato que se inserta
            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Por favor ingresa una sola letra valida.");
                continue;
            }
            
            char letra = entrada.charAt(0);
            
            //validar si ya se ingreso esa letra
            if (Adivinadas.contains(letra) || Incorrectas.contains(letra)) {
                System.out.println("Ya has utilizado esta letra.");
                continue;
            }
            
            //varificar si la letra esta en la palabra en juego
            if (PalabraEnJuego.contains(String.valueOf(letra))) {
                //si la palabra esta
                Adivinadas.add(letra);
                System.out.println("Correcto La letra '" + letra + "' esta en la palabra.");
            } else {
                //si no esta la palabra
                Incorrectas.add(letra);
                IntentosRestantes--;
                System.out.println("Incorrecto. La letra '" + letra + "' no esta en la palabra.");
            }
        }
        
        //resultado del juego 
        System.out.println("\n--- Fin del juego ---");
        if (palabraCompleta(PalabraEnJuego, Adivinadas)) {
            System.out.println("Felicitaciones Has adivinado la palabra: " + PalabraEnJuego);
        } else {
            System.out.println("Has perdido La palabra era: " + PalabraEnJuego);
        }
    }
    
    //muestra la palabra actual (con las letras adivinadas) y guiones (-) para las que no
    
    private static void mostrarActual(String PalabraEnJuego, Set<Character> Adivinadas) {
        System.out.print("Palabra: ");
        for (char letra : PalabraEnJuego.toCharArray()) {
            if (Adivinadas.contains(letra)) {
                System.out.print(letra + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
        
    //verifica si se adivinio completamente
    
    private static boolean palabraCompleta(String PalabraEnJuego, Set<Character> Adivinadas) {
    for (char letra : PalabraEnJuego.toCharArray()) {
        if (!Adivinadas.contains(letra)) {
            return false;
        }
    }
    return true;
    }
}
