/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorgrados;

/**
 *
 * @author juani
 */
import java.util.Scanner;

public class ConversorGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa la temperatura en grados Celsius");
        int celsius=sc.nextInt();
        
        //Conversion de celsius a fahrenheit
        int fahrenheit= celsius*(9/5)+32;
        
        System.out.println("Bien. Esa temperatura en grados fahrenheit es "+fahrenheit);
    }
    
}
