/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenarfrecuencia;

/**
 *
 * @author Aprendiz
 */
import java.util.*;

public class OrdenarFrecuencia {

    public static void main(String[] args) {

        int[] arr = {4, 4, 1, 2, 2, 2, 3};

        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int num : arr) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        List<Integer> lista = new ArrayList<>();
        for (int  num : arr) lista.add(num);

        Collections.sort(lista, (a,b) -> {
            int f1 = frecuencia.get(a);
            int f2 = frecuencia.get(b);

            if (f1 !=f2) return f2 - f1;
            return b - a;
        });

        System.out.println(lista);
    }
}

