package sumamatrices;


public class SumaMatrices {

    public static void main(String[] args) {
        int [][] matrizA=  {
            {1, 3},
            {2, 5}
        };
        
        int [][] matrizB={
            {4,2},
            {6,1}
        };
        
        
        int filas= matrizA.length;
        int columnas= matrizA[0].length;
        int [][] matrizC= new int [filas][columnas];
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                matrizC[i][j]= matrizA[i][j]+matrizB[i][j];
                System.out.print(+matrizC[i][j] +" ");
            }
        }
          
        
    }   
}
