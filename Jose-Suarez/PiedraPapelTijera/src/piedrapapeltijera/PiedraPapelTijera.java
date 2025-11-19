/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

/**
 *
 * @author Aprendiz
 */
import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

    public static String opcionNombre(int opcion) {
        switch (opcion) {
            case 1: return "Piedra";
            case 2: return "Papel";
            case 3: return "Tijera";
            default: return "";
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("helouda a piedra, papel o tijera");
        System.out.println("1 = piedra, 2 = papel, 3 = tijera");

        System.out.print("elige tu opcion (1-3): ");
        int jugador = sc.nextInt();

        if (jugador < 1 || jugador > 3) {
            System.out.println("opcion no permitida bro");
            sc.close();
            return;
        }
        int maquina = rand.nextInt(3) + 1;

        System.out.println("tu elegiste: " + opcionNombre(jugador));
        System.out.println("la pc de los chinos eligio: " + opcionNombre(maquina));

        if (jugador == maquina) {
            System.out.println("dos malos empatando");
        } else if ((jugador == 1 && maquina == 3) ||
                   (jugador == 2 && maquina == 1) ||
                   (jugador == 3 && maquina == 2)) {
            System.out.println("exelente ganaste men");
        } else {
            System.out.println("perdiste, vete del sena");
        }

        sc.close();
    }
}
