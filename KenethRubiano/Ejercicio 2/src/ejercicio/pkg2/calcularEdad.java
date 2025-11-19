/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author SoporteSENA
 */
import java.util.Scanner;

public class calcularEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE EDAD\n");
        
        System.out.print("Dia de nacimiento (1-31): ");
        int diaNac = sc.nextInt();
        
        System.out.print("Mes de nacimiento (1-12): ");
        int mesNac = sc.nextInt();
        
        System.out.print("Ano de nacimiento: ");
        int anioNac = sc.nextInt();
        
        // Fecha actual 
        int diaHoy = 12;
        int mesHoy = 11;
        int anioHoy = 2025;
        
        // Calculamos años
        int anios = anioHoy - anioNac;
        int meses = mesHoy - mesNac;
        int dias = diaHoy - diaNac;
        
        // si los días son negativos
        if (dias < 0) {
            meses = meses - 1;
            dias = dias + 30; // Simplificado (30 días por mes)
        }
        
        // si los meses son negativos
        if (meses < 0) {
            anios = anios - 1;
            meses = meses + 12;
        }
        
        // Mostrar resultado
        System.out.println("\nTU EDAD ");
        System.out.println("Tienes " + anios + " anos, " + meses + " meses y " + dias + " dias");
        
        sc.close();
    }
}
