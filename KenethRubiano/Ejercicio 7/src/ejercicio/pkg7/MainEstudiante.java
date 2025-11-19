/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio.pkg7;

/**
 *
 * @author SoporteSENA
 */

public class MainEstudiante {
    public static void main(String[] args) {

        Estudiante e = new Estudiante("Keneth", 4.0, 3.5);
/* traemos todas las variables de estudiante*/
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Promedio: " + e.promedio());
        System.out.println("Resultado: " + e.aprobo());
    }
}
