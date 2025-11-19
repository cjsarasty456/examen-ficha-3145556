/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.claseestudiante;

/**
 *
 * @author Arvol
 */
public class ClaseEstudiante {
    private static Estudiante lechuga = new Estudiante("lechuga",3.7,2.9); //instancia del estudiante
    
    public static void main(String[] args) {
        /*lechuga.getN();
        lechuga.getGrad1();
        lechuga.getGrad2();*/
        System.out.println("el promedio del estudiante "+lechuga.getN()+" fue de:"+lechuga.promedio()); //obtencion del promedio
        System.out.println(lechuga.aprobo(lechuga.promedio()));                                //Obtencion del resultado
    }
}
