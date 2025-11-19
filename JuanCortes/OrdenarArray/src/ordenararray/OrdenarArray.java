package ordenararray;


public class OrdenarArray {

    
    public static void main(String[] args) {
        int [] array= new int[]{4,4,1,2,2,2,3};
        int ubicacion1;
        int ubicacion2;
        
         for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) { 
                ubicacion1 = array[i + 1];
                if (array[i] > ubicacion1) {
                    ubicacion2 = array[i + 1];
                    array[i] = ubicacion2;
                    ubicacion1 = array[i];
                    array[i + 1] = ubicacion1;
                }
            }
        }

        System.out.print("El array ordenado por frecuencia de aparicion: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

