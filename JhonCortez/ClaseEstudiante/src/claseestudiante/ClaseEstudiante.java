/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseestudiante;

/**
 *
 * @author LENOVO
 */
public class ClaseEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("jhon",3.0,1.0);
        estudiante1.aprobo();
        //MEtodos get y sett
        //Esto sirve para que me den el nombre
        estudiante1.getNombre();
        estudiante1.getNota1();
        estudiante1.getNota2();
        estudiante1.setNombre("carlos");
        estudiante1.setNota1(5.0);
        estudiante1.setNota2(5.0);
        //Vuelvo a usar el motodo aprobo pero con los datos nuevos ingresados con los metodos sett
        
        estudiante1.aprobo();
    }
    
}
