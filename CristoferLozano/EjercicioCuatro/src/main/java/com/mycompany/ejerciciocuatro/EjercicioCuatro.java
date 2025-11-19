/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocuatro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
        //arreglo a ordenar por frecuencia
        int[] arreglo = {5, 4, 1, 3, 4, 2, 1, 2, 1};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        
        //ordenar por frecuencia
        int[] resultado = ordenarFrecuencia(arreglo);
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(resultado));
        
    }
    public static int[] ordenarFrecuencia(int[] arreglo){
        //Contar la frecuencia de los numeros dentro del arreglo
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : arreglo) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        
        //crear lista de elementos para ordenar
        List<Elemento> elementos = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            elementos.add(new Elemento(entry.getKey(), entry.getValue()));
        }
        
        //ordenar, primero por frecuencia, luego por valor 
        elementos.sort((a, b) -> {
            if (a.frecuencia != b.frecuencia) {
                return b.frecuencia - a.frecuencia; // numeros mas repetidos primero (mas frecuente)
            } else {
                return b.valor - a.valor; // Menor valor primero (1,2,3,etc...)
            }
        });
        // Construir arreglo resultante
        List<Integer> resultado = new ArrayList<>();
        for (Elemento elemento : elementos) {
            for (int i = 0; i < elemento.frecuencia; i++) {
                resultado.add(elemento.valor);
            }
        }

        // Convertir arreglo
        return resultado.stream().mapToInt(i -> i).toArray();
    }
    
    //clase para el valor y frecuencia (almacenado como elemento)
    static class Elemento {
        int valor;
        int frecuencia;

        Elemento(int valor, int frecuencia) {
            this.valor = valor;
            this.frecuencia = frecuencia;
        }
    }
}
