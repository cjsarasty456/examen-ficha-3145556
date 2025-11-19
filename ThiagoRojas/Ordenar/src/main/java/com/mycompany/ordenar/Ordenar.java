/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenar;

/**
 *
 * @author thiag
 */
import java.util.*;

public class Ordenar{
    public static void main(String[] args) {

        int[] numeros = {4,4,1,2,2,2,3};

        Map<Integer, Integer> frec = new HashMap<>();
        for (int n : numeros) {
            frec.put(n, frec.getOrDefault(n, 0) + 1);
        }
        //Esto lo que hace es ordenar de mayor a menor frecuencia el array que nosotros definos arriba pero si son iguales le da valor al que vale mas

        List<Integer> lista = new ArrayList<>();
        for (int n : numeros) {
            lista.add(n);
        }
        //Esto lo que hacee es el array lo convierte en una lista porque el collections que vamos a usar mas adelante no deja utilizar arrays pero si listas 

        Collections.sort(lista, (a, b) -> {
            int fa = frec.get(a);
            int fb = frec.get(b);

            if (fa != fb) {
                return fb - fa;
            } else {
                return a - b;
            }
        });
        //Aqui primero obtenemos la frecuencia y ordenamos comparandolas una a una en orden descendente y depsues imprimimos resultados
        System.out.println(lista);
    }
}
