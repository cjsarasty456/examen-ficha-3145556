/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celsiusfahrenheit;
import java.util.Scanner;
/**
 *
 * @author JUAN CAMILO
 */

// PUNTO 3
public class CelsiusFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese los grados celsius que deseas convertir a fahrenheit: ");
        double grados = sc.nextDouble(); // DATOS DE ENTRADA
        double conversion = grados * (9/5) + 32; // PROCESO
        
        System.out.println("los grados en fahrenheit son: " + conversion +"F"); // SALIDA
    }
    
}
