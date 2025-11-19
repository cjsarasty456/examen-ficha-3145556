/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversortemperatura;

/**
 *
 * @author Aprendiz
 */
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// Pedir al usuario la temperatura en Celsius
        System.out.print("ingrese la temperatura en celsius: ");
        double celsius = sc.nextDouble();
// Convertir la temperatura a Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
// Mostrar el resultado al usuario
        System.out.println("La temperatura en fahrenheit es: " + fahrenheit);

        sc.close();
    }
}
