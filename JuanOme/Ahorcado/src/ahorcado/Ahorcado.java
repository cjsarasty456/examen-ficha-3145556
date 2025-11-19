/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

/**
 *
 * @author juani
 */
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] palabras = {"duki", "musica", "examen", "poo"};
        String palabra = palabras[(int) (Math.random()*4)];

        //Determinamos la palabra con la que jugaremos
        char[] progreso = new char[palabra.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }
        
        //Definir cantidad de intentos
        int intentos = 5; 
        boolean completa = false;
        System.out.println("Tienes " + intentos + " intentos");

        //proceso si los intentos son distintos a 0 o si la palabra aun no esta completa
         while (intentos > 0 && !completa) {

            System.out.print("Palabra: ");
            for (char c : progreso) {
                System.out.print(c + " ");
            }
            System.out.println();

            //Lectura de solo el primer caractes ingresado
            System.out.print("Ingresa una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            boolean acierto = false;

            //cambiar vacio por letra acertada
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra && progreso[i] == '_') {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("Incorrecto. quedan: " + intentos+" intentos");
            } else {
                System.out.println("Correcto");
            }
            
            //Validar si se completo o no
            completa = true;
            for (char c : progreso) {
                if (c == '_') {
                    completa = false;
                    break;
                }
            }

            System.out.println();
        }


        if (completa) {
            System.out.print("Adivinaste la palabra ");
            System.out.println(palabra);
        } else {
            System.out.println(" La palabra era: " + palabra);
        }
    }
}
