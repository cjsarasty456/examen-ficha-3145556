/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

/**
 *
 * @author SoporteSENA
 */
import java.util.Scanner;
public class conversorCelsiusFahrenheit {
    public static void main (String[]args){
Scanner entrada = new Scanner(System.in);

System.out.print("Ingresa la temperatura en grados celcius");
double celcius = entrada.nextDouble();

double fahrenheit = (celcius *9/5) +32;

System.out.println(celcius + "C equivalen a " + fahrenheit + "F");
    }
}   