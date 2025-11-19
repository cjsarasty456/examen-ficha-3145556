/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularedad;

import java.util.Scanner;

/**
 *
 * @author JUSTINDANIELA
 */

// se crea la clase calcular edad donde le preguntamos a la persoan el dia, mes, año de nacimiento
public class Calcularedad {
    public static void main(String[] args){
        Scanner Sc = new Scanner (System.in);
  
        System.out.print("Ingresar tu dia de nacimiento: "); // dia 
        int DiaNacimiento = Sc.nextInt();

        System.out.print("Ingresar el mes de nacimiento: "); // mes 
        int MesNacimiento = Sc.nextInt();

        System.out.print("Ingresar el año de nacimiento: ");// año
        int AñoNacimiento = Sc.nextInt();

        
        
        // dia,mes y años actual en el que estamos 
        int diaACTUAL = 16;   
        int mesACTUAL = 11;
        int añoACTUAL = 2025;

        
        
        // aqui lo que hacemos es crea una variables años donde se va a restar el año actual con el año de nacimiento y asi con los demas 
        int años = añoACTUAL - AñoNacimiento;
        int meses = mesACTUAL - MesNacimiento;
        int dias = diaACTUAL - DiaNacimiento;

        if (dias < 0) {
            dias += 30;     // Si los días son negativos, les sumas 30 para "prestar" un mes
            meses -= 1;         // Y reduces un mes porque lo prestaste
        }
        
        if (meses < 0) {
            meses += 12;     // Si los meses son negativos, les sumas 12 para "prestar" un año
            años -= 1;     // Y reduces un año porque lo prestaste
        }

        
        // aqui lo que hacemos es imprimir la edad de la personas el meses y los dias en los que nacio 
        System.out.println("tu edad es: " + años);
        System.out.println("Meses: " + meses);
        System.out.println("Dias:  " + dias);
    }
}