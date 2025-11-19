/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar;
/**
 *
 * @author JUAN CAMILO
 */
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here`
        int[] array = {4,4,1,2,2,2,3};
        int n = array.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) if (array[i] == array[j]) c++;
            freq[i] = c;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (freq[j] > freq[i] || (freq[j] == freq[i] && array[j] < array[i])) {
                    int t = freq[i]; freq[i] = freq[j]; freq[j] = t;
                    t = array[i]; array[i] = array[j]; array[j] = t;
                }
            }
        }

        for (int x : array) System.out.print(x + " ");
    }
}
