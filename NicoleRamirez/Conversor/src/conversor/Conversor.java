/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor;
import java.util.Scanner;
/**
 *
 * @author Niki
 */
public class Conversor {
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       // se ingresan los grados en celsuis
        System.out.println("Ingrese los grados en Celsuis");
        int gradosc= sc.nextInt();
        // se aplica la formula para pasar de celsius a farenheit
        int conversor  = (gradosc * 9/5 ) +32;
        // en consola se muestra el resultado
        System.out.println("en farenheit serian: " + conversor + " grados");
        
    }
    
}
