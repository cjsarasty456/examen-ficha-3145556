/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;
import java.util.Scanner;
/**
 *
 * @author JUAN CAMILO
 */
public class PiedraPapelTijera {

    /**
     * @param opcion the command line arguments
     * @return
     */
    
      public static String opciones(int opcion) {
        if (opcion == 1) return "Piedra";
        if (opcion == 2) return "Papel";
        if (opcion == 3) return "Tijera";
        return "valor invalido";
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        System.out.println("PIEDRA PAPEL O TIJERA");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Elegir que quieres lanzar: ");
        int jugador = sc.nextInt();

        int maquina = (int) (Math.random() * 3) + 1;

        System.out.println("yo elijo: " + opciones(jugador));
        System.out.println("La maquina eligio: " + opciones(maquina));

        if (jugador == maquina) {
            System.out.println("EMPATE");
        } else if ((jugador == 1 && maquina == 3) ||
                   (jugador == 2 && maquina == 1) ||
                   (jugador == 3 && maquina == 2)) {
            System.out.println("GANE");
        } else {
            System.out.println("PERDI");
        }

    }
    
}


