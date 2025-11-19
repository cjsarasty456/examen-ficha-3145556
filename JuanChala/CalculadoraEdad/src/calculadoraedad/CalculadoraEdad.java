/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraedad;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Se solicita al usuario el ingreso de su edad, por partes, primero el año, luego el mes y por ultimo el dia
        System.out.println("Ingresa tu fecha de nacimiento en el siguiente orden: AA/MM/DD");
        
        System.out.println("Año: ");
        int anioPersona = sc.nextInt();
        
        System.out.println("Mes: ");
        byte mesPersona = sc.nextByte();
        
        System.out.println("Dia: ");
        byte diaPersona = sc.nextByte();
        
        // Se almacenan los dias que tiene cada mes en un arreglo
        byte[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Se captura la fecha actual (año, mes, dia) en las variables, por medio de la libreria LocalDate
        LocalDate fechaActual = LocalDate.now();
        int diaActual = fechaActual.getDayOfMonth();
        int mesActual = fechaActual.getMonthValue();
        int anioActual = fechaActual.getYear();
        
        // Se valida que el año actual si es bisiesto
        boolean bisiesto = (anioActual % 4 == 0 && anioActual % 100 != 0) || (anioActual % 400 == 0);
        if (bisiesto) {
            meses[1] = 29;
        }
        
        // Se realiza la operacion de resta para verificar cuantos años tiene la persona, en años, meses y dias
        int anios = anioActual - anioPersona;
        int mes = mesActual - mesPersona;
        int dias = diaActual - diaPersona;
        
        // Se imprime la edad
        System.out.println("Tu edad exacta es: " + anios + " años, " + mes + " meses y " + dias + " dias.");
        
        sc.close();
    }   
}
