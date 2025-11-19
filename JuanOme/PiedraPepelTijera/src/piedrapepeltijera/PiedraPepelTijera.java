/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapepeltijera;

/**
 *
 * @author juani
 */
import java.util.Scanner;

public class PiedraPepelTijera {

    // Metodo que convierte un numero en el nombre correspondiente
    public static String convertirOpcion(int opcion) {
        switch (opcion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "Opcion invalida";
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opcion:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Tu opcion: ");
        
        int jugador = sc.nextInt();

        // Validar la opción del jugador
        if (jugador < 1 || jugador > 3) {
            System.out.println("Opcion invalida. Debes elegir 1, 2 o 3.");
            return;
        }

        // Generar opcion aleatoria de la maquina
        int maquina = (int)(Math.random() * 3) + 1;

        System.out.println("Tu elegiste: " + convertirOpcion(jugador));
        System.out.println("La maquina eligio: " + convertirOpcion(maquina));

        // Determinar el resultado
        if (jugador == maquina) {
            System.out.println("Resultado: Empataron");
        } else if (jugador == 1 && maquina == 3 ||jugador == 2 && maquina == 1 ||jugador == 3 && maquina == 2){
            System.out.println("Resultado: Ganaste");
        } else {
            System.out.println("Resultado: Perdiste");
        }
    }
}

