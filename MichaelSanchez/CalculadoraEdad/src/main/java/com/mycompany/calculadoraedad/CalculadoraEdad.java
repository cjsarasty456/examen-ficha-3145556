
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraedad;

import java.util.Scanner;

public class CalculadoraEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Ingresa tu dia de nacimiento:");
        int diaN = sc.nextInt();

        System.out.println("Ingresa tu mes de nacimiento (1-12):");
        int mesN = sc.nextInt();

        System.out.println("Ingresa tu año de nacimiento:");
        int añoN = sc.nextInt();
    
        int diaA = 19;
        int mesA = 11;
        int añoA = 2025;

        int dias = diaA - diaN;
        int meses = mesA - mesN;
        int años = añoA - añoN;

        if (dias < 0) {
            dias += 30;
            meses -= 1;
        }

        if (meses < 0) {
            meses += 12;
            años -= 1;
        }

        System.out.println("Tu edad exacta es:");
        System.out.println(años + " años, " + meses + " meses y " + dias + " días.");
    }
}


