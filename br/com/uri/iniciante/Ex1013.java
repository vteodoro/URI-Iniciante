package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1013 {    
    public static void main(String[]args){
        int a;
        int b;
        int c;
        
        Scanner s = new Scanner(System.in);
        
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        
        int maiorAB = (a+b+ Math.abs(a-b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        
        System.out.println(maior + " eh o maior");
    }
}