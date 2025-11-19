/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celsiusfahrenheit;

import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pide la temperatura en grados celsius
        System.out.println("Ingresa la temperatura en Celsius: ");
        byte c = sc.nextByte();
        
        // Operacion para pasar de celsius a Fahrenheit
        double fahrenheit = (c * 9/5) + 32;
        
        // Se imprime el resultado
        System.out.println("Fahrenheit: " + c + " x 9 / 5 " + " + 32 = " + (fahrenheit));
        
        sc.close();
    }
}
