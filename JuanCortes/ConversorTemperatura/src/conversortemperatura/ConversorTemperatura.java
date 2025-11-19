package conversortemperatura;

import java.util.Scanner;

public class ConversorTemperatura {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Ingresa la temperatura en Celsius: ");
        double celsius= sc.nextDouble();
        
        double farenheit=celsius*9/5+32;
        
        System.out.println("La temperatura en grados farenheit es: "+farenheit);
    }
    
}
