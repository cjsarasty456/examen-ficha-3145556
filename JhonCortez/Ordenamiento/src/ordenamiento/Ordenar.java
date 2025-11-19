/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
public class Ordenar {
    public void ordenar(){
        int[] num = {4,4,2,2,2,3};
        int[] numO;
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        int count = 0;
        System.out.println("Ordenados por orden de frecuencia:");
        for (int i = 0; i < num.length; i++) {
            temp = 0;
            for (int j = 0; j+1 < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[j];
                    num[i] = temp;
                }
                temp = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
