/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;
// librerias que utilizo
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author JUAN CAMILO
 */

// PUNTO 1
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // array para almacenar mis palabras
        String[] palabras = {"java","gafas","portatil","libros","casa","escritorio"};
        // elijo aleatoriamente la palabra, entre las que escribi para tratar de adivinarlas
        String palabra = palabras[random.nextInt(palabras.length)];
        
        
        // recorro cada letra de mi palabra
        char[] avance = new char[palabra.length()];
        for (int i = 0; i < avance.length; i++) {
            avance[i] = '-';
        }
        
         int intentos = 10;
        System.out.println("MINIJUEGO EL AHORCADO");

        // con este ciclo digo que si los intentos no han llegado a cero puedo seguir jugando
        while (intentos > 0) {
            System.out.println("Palabra: " + new String(avance));
            System.out.println("te quedan: " + intentos + " intentos");
            System.out.print("Ingresar letra: ");
            char letra = scanner.next().charAt(0);

            boolean encontrada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    avance[i] = letra;
                    encontrada = true;
                }
            }

            if (!encontrada) {
                intentos = intentos - 1;
                System.out.println("ESTA LETRA NO HACE PARTE DE LA PALABRA");
            }

            else if (new String(avance).equals(palabra)) {
                System.out.println("Ganaste! La palabra era: " + palabra);
                return;
            }

        }

        System.out.println("Perdiste. La palabra era: " + palabra);
    }
    
}
