/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversorcelsius.fahrenheit;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class ConversorCelsiusFahrenheit {

    public static void main(String[] args) {
        
        Scanner quest = new Scanner(System.in);
        
        System.out.println("Ingresa una temperatura en celcius y conviertela a fahrenheit");
        double celcius = quest.nextDouble();
        
        double calculo = (celcius * 9/5)+32;
        
        double fahrenheit = calculo;
         System.out.println("la convercion de el valor celcius"+ celcius +"que ingreso en fahrenheit es : "+ fahrenheit);
        
        
        
    }
}
