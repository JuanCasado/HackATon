package ej3;

import java.util.ArrayList;
import java.util.Scanner;


public class ej3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> expresions = new ArrayList<>();
        ArrayList<Boolean> isRange = new ArrayList<>();
        String exp;
        System.out.println("Insert next expresion: ");
        exp = reader.nextLine();
        boolean multiple = false;
        String buff = "";
        for (int i = 0; i < exp.length(); ++i){
            if (exp.charAt(i)=='['){
                multiple = true;
            }
            if(multiple){
                buff += exp.charAt(i)+"";
                if (exp.charAt(i)==']'){
                   multiple = false;
                   isRange.add(exp.contains("-"));
                    if (isRange.get(isRange.size()-1)){
                        expresions.add(""+exp.charAt(i-3)+exp.charAt(i-1));
                    } else {
                        expresions.add(exp);
                    }
                   buff = "";
                }
            }else{
                expresions.add(""+exp.charAt(i));
                isRange.add(false);
            }
        }
        
        System.out.println("Insert sentence: ");
        String input = reader.nextLine();
 
        
        boolean isOk = expresions.size()==input.length();
        
        for (int i = 0; (i < input.length())&&isOk; ++i){
            if (isRange.get(i)){
                if(!((input.charAt(i) >= expresions.get(i).charAt(0))&&(input.charAt(i) <= expresions.get(i).charAt(1)))){
                    isOk = false;
                }
            } else {
            if(!contains(expresions.get(i),input.charAt(i))){
                    isOk = false;
                }
            }
        }
        if (isOk){
            System.out.println("OK");
        }else{
            System.out.println("NOT OK");
        }
    }
    
    public static boolean contains (String str, char c){
        for (int i = 0; i < str.length(); ++i){
            if (str.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
    
}
