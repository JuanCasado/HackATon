package pkg0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     ArrayList<String> arr= new ArrayList<>();
     HashMap<String,String> map = new HashMap<>();
     
     int n = 0;
     n = pedirN();
     int[][] matriz = new int[n][n];
     pedirMatriz(n,matriz);
     //imprimirMatriz(matriz,n);
     
     int[] sumaColumnas = sumaColumnas(matriz);
     
     int sumaDiagonales2 = sumaDiagonales2(matriz);
        System.out.println(sumaDiagonales2);
    }
    
    
    public static int pedirN(){
      Scanner reader = new Scanner(System.in);
        
      int n = 0;
      System.out.println("Introduce valor n: ");
      n=reader.nextInt();
  
      return n;
    }
    public static void pedirMatriz(int n,int[][] matriz){ 
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
    
    public static void imprimirMatriz(int[][] matriz,int n){
       for(int i = 0; i<n ;i++){
          for(int j = 0;j<n;j++){
             System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
       } 
    }
    
    public static int sumaDiagonales1(int [][] matrizEntrada) {
        int suma_diagonales = 0;
        for (int i = 0; i < matrizEntrada.length; ++i){
            suma_diagonales+= matrizEntrada[i][i];
        }
        return suma_diagonales;
    }
    
    public static int sumaDiagonales2(int [][] matrizEntrada) {
        int suma_diagonales =0 ;
        for (int i = 0; i < matrizEntrada.length; ++i){
            suma_diagonales+= matrizEntrada[i][matrizEntrada.length - i - 1];
        }
        return suma_diagonales;
    }
}
