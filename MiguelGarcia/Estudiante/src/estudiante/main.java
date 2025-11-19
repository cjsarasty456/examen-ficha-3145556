/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author USUARIO
 */
public class main {
    public static void main(String[] args) {

        // Creo un estudiante con nombre y sus notas
        Estudiante estudiante = new Estudiante("Miguel", 2.5, 3.8);

        // Muestro la informacion de mi estudiante
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Promedio: " + estudiante.promedio());
        System.out.println("Resultado: " + estudiante.aprobo());
    }
}
