/*
 * Mr.BlissfulGrin
 */
package ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mr.blissfulgrin
 */
public class ej2 {
    static ArrayList<String> buffer1 = new  ArrayList<>();
    static ArrayList<String> buffer2 = new  ArrayList<>();
    static ArrayList<String> buffer3 = new  ArrayList<>();
    static ArrayList<String> buffer4 = new  ArrayList<>();
    static ArrayList<String> buffer5 = new  ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Give me a sentence: ");
        String frase = getFrase().toUpperCase();
        for (int i = 0; i < frase.length(); ++i){
            String[][] letter = new String[5][5]; 
            for (int x = 0; x < 5; ++x){
                for (int y = 0; y < 5; ++y){
                    letter[x][y] = " ";
                }
            }
            switch(frase.charAt(i)){
                case 'A':
                    setRows(letter, 0);
                    setRows(letter, 2);
                    setColumns(letter, 0);
                    setColumns(letter, 4);
                    break;
                case 'B':
                    setRows(letter, 0);
                    setRows(letter, 2);
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    setColumns(letter, 3);
                    break;
                case 'C':
                    setRows(letter, 0);
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    break;
                case 'D':
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    diagonals1(letter);
                    break;
                case 'E':
                    setRows(letter, 2);
                    setRows(letter, 0);
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    break;
                case 'F':
                    setRows(letter, 0);
                    setRows(letter, 2);
                    setColumns(letter, 0);
                    break;
                case 'G':
                    setRows(letter, 0);
                    setRows(letter, 2);
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    setColumns(letter, 0);
                    setMediaIColumns(letter, 4);
                    break;
                case 'H':
                    setColumns(letter, 0);
                    setColumns(letter, 4);
                    setRows(letter, 2);
                    break;
                case 'I':
                    setRows(letter, 0);
                    setRows(letter, 4);
                    setColumns(letter, 2);
                    break;
                case 'J':
                    setRows(letter, 4);
                    setColumns(letter, 4);
                    setMediaIColumns(letter, 0);
                    break;
                case 'K':
                    setColumns(letter, 2);
                    diagonalsS2(letter);
                    diagonalsI1(letter);
                    break;
                case 'L':    
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    break;
                case 'M':
                    setColumns(letter, 0);
                    setColumns(letter, 4);
                    diagonalsS1(letter);
                    diagonalsS2(letter);
                    break;
                case 'N':
                    setColumns(letter, 0);
                    setColumns(letter, 4);
                    diagonals1(letter);
                    break;
                case 'O':
                    setRows(letter, 0);
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    setColumns(letter, 4);
                    break;
                case 'P':
                    setColumns(letter, 0);
                    setRows(letter, 0);
                    setRows(letter, 2);
                    setMediaSColumns(letter, 4);
                    break;
                case 'Q':
                    setRows(letter, 0);
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    setColumns(letter, 4);
                    diagonalsI1(letter);
                    break;
                case 'R':
                    setColumns(letter, 0);
                    setMediaSColumns(letter, 4);
                    setRows(letter, 0);
                    setMediaSRows(letter, 2);
                    diagonalsI1(letter);
                    break;
                case 'S':
                    setRows(letter, 0);
                    setRows(letter, 2);
                    setRows(letter, 4);
                    setMediaSColumns(letter, 0);
                    setMediaIColumns(letter, 4);
                    break;
                case 'T':
                    setRows(letter, 0);
                    setColumns(letter, 2);
                    break;
                case 'U':
                    setRows(letter, 4);
                    setColumns(letter, 0);
                    setColumns(letter, 4);
                    break;
                case 'V':
                    diagonalsS1(letter);
                    diagonalsS2(letter);
                    break;
                case 'W':
                    setColumns(letter, 0);
                    setColumns(letter, 4);
                    diagonalsI1(letter);
                    diagonalsI2(letter);
                    break;
                case 'X':
                    diagonals1(letter);
                    diagonals2(letter);
                    break;
                
                case 'Y':
                    diagonalsS1(letter);
                    diagonalsS2(letter);
                    setMediaIColumns(letter, 2);
                    break;
                case 'Z':
                    setRows(letter, 4);
                    setRows(letter, 0);
                    diagonals2(letter);
                    break;
                case ' ':
                    break;
                default:
                    //System.out.println(frase.charAt(i) + " no realizado");
                    break;
            }
            imprimirMatriz(letter);
        }
        for (String s : buffer1){
            System.out.print(s);
        }System.out.println("");
        for (String s : buffer2){
            System.out.print(s);
        }System.out.println("");
        for (String s : buffer3){
            System.out.print(s);
        }System.out.println("");
        for (String s : buffer4){
            System.out.print(s);
        }System.out.println("");
        for (String s : buffer5){
            System.out.print(s);
        }System.out.println("");
    }
    
    public static void imprimirMatriz(String[][] matriz){
       for(int i = 0; i<matriz.length ;i++){
             buffer1.add(matriz[0][i]);
             buffer2.add(matriz[1][i]);
             buffer3.add(matriz[2][i]);
             buffer4.add(matriz[3][i]);
             buffer5.add(matriz[4][i]);
       } 
        buffer1.add("  ");
        buffer2.add("  ");
        buffer3.add("  ");
        buffer4.add("  ");
        buffer5.add("  ");
    }
    
    static public String getFrase(){
      Scanner reader = new Scanner(System.in);
      return reader.nextLine();
    }
    
    public static void setRows(String[][] matrizEntrada, int pos){
        setMediaSRows(matrizEntrada,pos);
        setMediaIRows(matrizEntrada,pos);
    }
    
    public static void setColumns(String[][] matrizEntrada, int pos){
        setMediaSColumns(matrizEntrada,pos);
        setMediaIColumns(matrizEntrada,pos);
    }
    public static void setMediaSRows(String[][] matrizEntrada, int pos){
        for(int i = 0; i < matrizEntrada.length/2; i++){
            matrizEntrada[pos][i] = "#";
        }
    }
    
    public static void setMediaSColumns(String[][] matrizEntrada, int pos){
        for(int i = 0; i < matrizEntrada.length/2; i++){
            matrizEntrada[i][pos] = "#";
        }
    }
    public static void setMediaIRows(String[][] matrizEntrada, int pos){
        for(int i = matrizEntrada.length/2; i < matrizEntrada.length; i++){
            matrizEntrada[pos][i] = "#";
        }
    }
    
    public static void setMediaIColumns(String[][] matrizEntrada, int pos){
    for(int i = matrizEntrada.length/2; i < matrizEntrada.length; i++){
        matrizEntrada[i][pos] = "#";
    }
   }
    
    public static void diagonals1(String[][] matriz){
        diagonalsS1(matriz);
        diagonalsI1(matriz);
    }
    public static void diagonalsS1(String[][] matriz){
        matriz[0][0] = "#";
        matriz[1][1] = "#";
        matriz[2][2] = "#";
    }
    public static void diagonalsI1(String[][] matriz){
        matriz[2][2] = "#";
        matriz[3][3] = "#";
        matriz[4][4] = "#";
    }
    
    
    public static void diagonals2(String[][] matriz){
        diagonalsS2(matriz);
        diagonalsI2(matriz);
    }
    public static void diagonalsS2(String[][] matriz){
        matriz[0][4] = "#";
        matriz[1][3] = "#";
        matriz[2][2] = "#";
    }
    public static void diagonalsI2(String[][] matriz){
        matriz[2][2] = "#";
        matriz[3][1] = "#";
        matriz[4][0] = "#";
    }
}
