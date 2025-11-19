/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraedad;

/**
 *
 * @author juani
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculadoraEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            // Solicitar fecha de nacimiento
            System.out.print("Ingrese su dia de nacimiento: ");
            int dia = sc.nextInt();

            System.out.print("Ingrese su mes de nacimiento: ");
            int mes = sc.nextInt();

            System.out.print("Ingrese su año de nacimiento: ");
            int año = sc.nextInt();

            // Acomodar valores ingresados en formato de fecha
            LocalDate fechaNacimiento;
            
            fechaNacimiento = LocalDate.of(año, mes, dia);

            // Fecha actual
            LocalDate hoy = LocalDate.now();          

            // Calcular edad exacta
            Period edad = Period.between(fechaNacimiento, hoy);

            // Mostrar resultado
            System.out.printf("Tienes "+edad.getYears()+" años "+ edad.getMonths()+ " meses "+ edad.getDays());
    }
}
