/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertir_grados;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Convertir_Grados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Le pedimos al usuario la temperatura en Celsius
        System.out.print("Digte la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        // Aquí tenemos la de conversión
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Mostramos el resultado
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

    }

}

