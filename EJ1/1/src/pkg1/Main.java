/*
 * Mr.BlissfulGrin
 */
package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mr.blissfulgrin
 */
public class Main {
    public static void main(String[] args) {
     ArrayList<String> arr= new ArrayList<>();
     HashMap<String,String> map = new HashMap<>();
     
     int n = 0;
     n = pedirN();
     int[][] matriz = new int[n][n];
     pedirMatriz(n,matriz);
     //imprimirMatriz(matriz,n);
     int tmp = 0;
     imprimirMatriz(matriz);
     while (!esIgual(matriz, n)){
         int i1 = maxInd(sumaColumnas(matriz));
         int j1 = maxInd(sumaFilas(matriz));
         int i2 = minInd(sumaColumnas(matriz));
         int j2 = minInd(sumaFilas(matriz));
         tmp = matriz[i2][j2];
         matriz[i2][j2] = matriz[i1][j1];
         matriz[i1][j1] = tmp;
         imprimirMatriz(matriz);
         System.out.println("-----------------------");
         for (int i = 0; i < sumaColumnas(matriz).length; i++){
             System.out.print(sumaColumnas(matriz)[i]+",");
         }
         System.out.println(i1);
         System.out.println(j1);
         System.out.println(matriz[i2][j2]);
         System.out.println(i2);
         System.out.println(j2);
         System.out.println(tmp);
         System.out.println("-----------------------");
     }
    }
    
    public static int sumaDiagonales1(int [][] matrizEntrada) {
        int suma_diagonales = 0;
        for (int i = 0; i < matrizEntrada.length; ++i){
                suma_diagonales += matrizEntrada[i][i];
        }
        return suma_diagonales;
    }
    
    public static int sumaDiagonales2(int [][] matrizEntrada) {
        int suma_diagonales = 0;
        for (int i = 0; i < matrizEntrada.length; ++i){
            suma_diagonales += matrizEntrada[i][matrizEntrada.length - i - 1];
        }
        return suma_diagonales;
    }
    
    
    static public int pedirN(){
      Scanner reader = new Scanner(System.in);
        
      int n = 0;
      System.out.println("Introduce valor n: ");
      n=reader.nextInt();
  
      return n;
    }
    static public void pedirMatriz(int n,int[][] matriz){ 
       Scanner reader = new Scanner(System.in);

       for(int i = 0; i<n ;i++){
           for(int j = 0;j<n;j++){
               System.out.println("Introduce valor " + i + " " + j+": ");
               matriz[i][j] = reader.nextInt();
           }
       }  
    }
    
    public static int[] sumaColumnas(int [][] matrizEntrada) {
        int suma_columnas [] = new int [matrizEntrada.length];
        for (int i = 0; i < matrizEntrada.length; ++i){
            suma_columnas[i] = 0;
            for (int j = 0; j < matrizEntrada[i].length; ++j){
                suma_columnas[i] += matrizEntrada[i][j];
            }
        }
        return suma_columnas;
    }
    
    public static void imprimirMatriz(int[][] matriz){
       for(int i = 0; i<matriz.length ;i++){
          for(int j = 0;j<matriz.length;j++){
             System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
       } 
    }
    
    public static int[] sumaFilas(int [][] matrizEntrada){
        int[] matriz = new int[matrizEntrada.length];
        int aux = 0;
        for(int j = 0; j < matrizEntrada.length; j++){
            for(int i = 0; i < matrizEntrada[j].length; i++){
            aux += matrizEntrada[i][j];
            }
            matriz[j] = aux;
        }
        return matriz;
    }
    static public int maxInd(int [] matrizEntrada){
        int aux = 0; 
        int ind = 0;
        for(int i = 0; i < matrizEntrada.length; i++){
            if (aux < matrizEntrada[i]){
                aux = matrizEntrada[i];
                ind = i;
            }
        }
        return ind;
    }
    static public int minInd(int [] matrizEntrada){
        int aux = 0; 
        int ind = 0;
        for(int i = 0; i < matrizEntrada.length; i++){
            if (aux > matrizEntrada[i]) {
                aux = matrizEntrada[i];
                ind = i;
            }
        }
        return ind;
    }
    
    public static int calcularMagico (int n){
        return n+(n*n +1)/2;
    }
    
    public static boolean esIgual(int[][] matriz,int n){
        boolean bool = true;
        
        int magico = calcularMagico(n);
        int sumaDia1 = sumaDiagonales1(matriz);
        int sumaDia2 = sumaDiagonales2(matriz);
         
        int[] sumaFilas = sumaFilas(matriz);
        int[] sumaColumnas = sumaColumnas(matriz);
        
        for(int i = 0;i<sumaFilas.length;i++){
            if(sumaFilas[i]!= magico){
               bool = false; 
            }
        }
        
        for(int i = 0;i<sumaColumnas.length;i++){
            if(sumaColumnas[i]!= magico){
               bool = false; 
            }
        }
        
        if(sumaDia1!=magico){
            bool = false;
        }
        
        if(sumaDia2!=magico){
            bool = false;
        }
        return bool;
    }
}
