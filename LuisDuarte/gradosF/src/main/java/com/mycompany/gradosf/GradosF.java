/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradosf;
import java.util.*;
/**
 *
 * 3. Conversor de grados Celsius a Fahrenheit
Descripción:
Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit usando:
𝐹 = 𝐶 ×
9
5
+ 32
Puntos para practicar:
Manejo de variables
Operaciones matemáticas simples

 */
public class GradosF {

    public static void main(String[] args) {
        System.out.println("Ingresa los grados celcius para convertirlos en grados Fahrenheit");
       Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        
        int b =a*9; // cree la secuencia de lo que seria la operacion como tal no es tan eficiente pero llega al resultado
        int c =b/5;
        int d =c +32;
        System.out.println("El valor en grados celcius "+a + "en grados Fahrenheit es= " +d);
    }
}
