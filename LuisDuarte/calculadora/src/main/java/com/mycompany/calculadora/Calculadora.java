/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.*;

/**
 *
 * 2. Calculadora de edad exacta
Pide al usuario su fecha de nacimiento (día, mes, año) y calcula su edad actual exacta (años,
meses y días).
Estructuras: manejo de fechas, condicionales, operaciones aritméticas.
 */
public class Calculadora {

    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            
        //SOLICITA LA FECHA ACTUAL

                                System.out.println("Ingrese el dia actual"); 
                    int diaA=sc.nextInt();
                                System.out.println("Ingrese el mes actual");
                    int mesA=sc.nextInt();
                                System.out.println("Ingrese el año actual");
                    int anoA=sc.nextInt();
            
        //SOLICITA LA FECHA DE NACIMIENTO
            
            System.out.println("Ingrese el dia de su nacimiento");
            int dia = sc.nextInt();
            
            System.out.println("Ingrese el mes de su nacimiento");
            int mes = sc.nextInt();
            
            System.out.println("Ingrese el año de su nacimiento");
            int ano = sc.nextInt();
             
        // CREE UNA CONDICIONAL DADO EL CASO QUE EL USUARIO COLOQUE ALREBES LOS VALORES DE ERROR POR QUE LA FECHA DE NACIMIENTO NO SERA IGUAL A LA FECHA ACTUAL SI EN DADO CASO EL USUARIO ALLA ACABADO DE NACER    
            
            if (dia < diaA && mes < mesA && ano < anoA){
                    int diaT=  diaA - dia;
                    int mesT=  mesA - mes;
                    int anoT=  anoA - ano;

            System.out.println("Tu edad exacta es:  \ndias= "+diaT+ "\nmes= "+mesT+ "\naños= "+anoT);
           
                }else{
                    System.out.println("Ingreso datos que excede las fechas");
                }
            
    }
}
