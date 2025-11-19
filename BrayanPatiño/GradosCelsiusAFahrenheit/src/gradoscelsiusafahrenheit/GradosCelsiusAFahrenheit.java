/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradoscelsiusafahrenheit;

/**
 *
 * @author Aprendiz
 */
import java.util.Scanner;
public class GradosCelsiusAFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
     
     Scanner sc = new Scanner(System.in);
     
        System.out.println("Ingresa una temperatura en celsius para convertirla en fahrenheit ");
        
        double celsius = sc.nextDouble();
        
        double fahrenheit = celsius * 9/5 + 32;
        
        System.out.println("De " + celsius + " Celsius a Fahrenheit es: " + fahrenheit);
     
    }
    
}
