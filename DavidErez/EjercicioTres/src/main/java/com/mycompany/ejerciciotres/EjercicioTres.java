/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;

import java.util.Scanner;

/**
 *
 * @author nox
 */
public class EjercicioTres {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("ingrese la temperatura en celcius para convertirla en fahrenheit");
        double valorUno = 0;
        double fa = 0;
        valorUno = sc.nextDouble();
        // aca se hace la convercio.n
        fa = valorUno * (9/5) + 32; 
        System.out.println("el resultado de la connversion es: "+fa);
    }
}

}
