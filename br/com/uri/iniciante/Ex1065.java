package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1065 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cont = 0;
        for(int i = 0; i < 5; i++){
            int[] x = new int[5];
            x[i] = s.nextInt();
            
            if(x[i] %2 == 0){
                cont ++;
            }
        }
        
        System.out.println(cont + " valores pares");
    }
}
