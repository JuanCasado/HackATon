/*
 * Mr.BlissfulGrin
 */
package pkg1;

/**
 *
 * @author mr.blissfulgrin
 */
public class Main {
    public static void main(String[] args) {
        
    }
    public int[] sumaColumnas(int [][] matrizEntrada) {
        int suma_columnas [] = new int [matrizEntrada.length];
        for (int i = 0; i < matrizEntrada.length; ++i){
            suma_columnas[i] = 0;
            for (int j = 0; j < matrizEntrada[i].length; ++j){
                suma_columnas[i] += matrizEntrada[i][j];
            }
        }
        return suma_columnas;
    }
    
    public int[] sumaDiagonales1(int [][] matrizEntrada) {
        int suma_diagonales [] = new int [2];
        for (int i = 0; i < matrizEntrada.length; ++i){
                suma_diagonales[i] += matrizEntrada[i][i];
        }
        return suma_diagonales;
    }
    
    public int[] sumaDiagonales2(int [][] matrizEntrada) {
        int suma_diagonales [] = new int [2];
        for (int i = 0; i < matrizEntrada.length; ++i){
            suma_diagonales[i] += matrizEntrada[i][i];
        }
        return suma_diagonales;
    }
   
}
