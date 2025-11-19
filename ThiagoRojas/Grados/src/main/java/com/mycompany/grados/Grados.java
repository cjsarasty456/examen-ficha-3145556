/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grados;

import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class Grados {

    public static void main(String[] args) {
        Scanner Grados = new Scanner(System.in);
        //Se crea el scanner de grados para que el usuario pueda interactuar con el sistema 
        
        System.out.println("Ingresa la temperatura en grados celcius");
        int celcius = Grados.nextInt();
        //El usuario ingresa la temperatura en grados celcius para verificarla en grados farenheit
        int farenheit = celcius * (9/5) + 32 ;
        //Formula para convertir los celcius a farenheit
        
        System.out.println("La temperatura de " + celcius + " grados C en farenheit es "+ farenheit + " grados F");
    } //Se imprimen los resultados 
}


