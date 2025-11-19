/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.punto4;

import java.util.*;

/**
 *
 * @author Jonattan Rizo
 */

public class Punto4 {
    public static void main(String[] args) {
        int[] ArregloEntrada = {4, 4, 1, 2, 2, 2, 3};
        
        // El map y el HashMap ayudar a contar la cantidad de numeros que se repiten dentro de: ArregloEntrada el cual debemos ajustar
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : ArregloEntrada) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Integer[] ArregloFrecuencia = Arrays.stream(ArregloEntrada).boxed().toArray(Integer[]::new);

        Arrays.sort(ArregloFrecuencia, (a, b) -> {
            int countA = countMap.get(a);
            int countB = countMap.get(b);
            return countB - countA == 0 ? a - b : countB - countA;
        });

        System.out.println("Arreglo de manera desorganizada numericamente" + Arrays.toString(ArregloEntrada));
        System.out.println();
        System.out.println("Arreglo con frecuencia de aparición: " + Arrays.toString(ArregloFrecuencia));
    }
}