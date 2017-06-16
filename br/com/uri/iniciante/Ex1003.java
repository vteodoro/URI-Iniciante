package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1003 {
    
    public static void main(String[]args){
        
        int A;
        int B;
        int SOMA;
        
        Scanner s = new Scanner(System.in);
        
        A = s.nextInt();
        B = s.nextInt();
        
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
        
    }
    
}
