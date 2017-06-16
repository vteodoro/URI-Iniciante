package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1004 {
    
    public static void main(String[]args){
        
        int A;
        int B;
        int PROD;
        
        Scanner s = new Scanner(System.in);
        
        A = s.nextInt();
        B = s.nextInt();
        
        PROD = A * B;
        
        System.out.println("PROD = " + PROD);
        
    }    
}