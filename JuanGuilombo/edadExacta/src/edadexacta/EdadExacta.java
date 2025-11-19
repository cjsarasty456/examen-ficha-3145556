/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadexacta;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author JUAN CAMILO
 */
public class EdadExacta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia de nacimiento: ");
        int d = sc.nextInt();

        System.out.print("Mes de nacimiento: ");
        int m = sc.nextInt();

        System.out.print("Año de nacimiento: ");
        int a = sc.nextInt();

        LocalDate hoy = LocalDate.now();
        int dh = hoy.getDayOfMonth();
        int mh = hoy.getMonthValue();
        int ah = hoy.getYear();

        int años = ah - a;
        int meses = mh - m;
        int dias = dh - d;

        if (dias < 0) {
            dias += 30;
            meses -= 1;
        }

        if (meses < 0) {
            meses += 12;
            años -= 1;
        }

        System.out.println("Edad: " + años + " anos, " + meses + " meses, " + dias + " dias");

    }
    
}
