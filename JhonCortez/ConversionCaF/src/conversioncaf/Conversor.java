/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversioncaf;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
//Programa para pasar de grados celcius a fahrenheit
public class Conversor {
    //metodo que va a hacer toda la logica
    Scanner entrada = new Scanner(System.in);
    public void convertir(){
        System.out.println("Digite la temperatura en Celcius");
        double c = entrada.nextDouble();
        
        double f = (c*9/5)+32;
        
        System.out.println("Al convertir "+c +"C a F es igual a: "+f+"F");
    }
}
