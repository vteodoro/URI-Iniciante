package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1007 {
    
    public static void main(String[]args){
        
        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;
        
        Scanner s = new Scanner(System.in);
        
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();
        
        DIFERENCA = (A*B - C*D);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
    
    }
    
}