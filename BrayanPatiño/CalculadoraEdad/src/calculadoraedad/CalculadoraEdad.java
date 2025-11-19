/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraedad;

/**
 *
 * @author Aprendiz
 */
import java.util.Scanner;

public class CalculadoraEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dia de su nacimiento");
        int dia = sc.nextInt();
        System.out.println("Ingresa el mes de su nacimiento en número");
        int mes = sc.nextInt();
        System.out.println("Ingresa el año de su nacimiento");
        int anio = sc.nextInt();
        
       // Puse la fecha actual. El 19 de noviembre(11) del 2025
        int anio2 = 2025 - anio;
        int mes2 = 11 - mes;//El 11 se hace referencia a noviembre
        int dia2 = 19 - dia;
        if (mes < 0){
            System.out.println("No existen los meses negativos");
        }
        if(anio > 2025){
            System.out.println("Por favor, pon el año verdadero");
        }else{
            dia2 ++;
              System.out.println("Su edad exacta es: " + anio2 + " Años "+" ||"+   mes2+ " Meses " + "||"  + dia2 + "Dias");
              
        }
        
        
      
        
    }
    
}
