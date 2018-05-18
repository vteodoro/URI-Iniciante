package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1060 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i = 0;
        double[] j = new double[6];
        int cont = 0;

        while(i < 6){
           j[i] = s.nextDouble();
           if(j[i] > 0){
                cont++;
           }
           i++;
        }
        
        System.out.println(cont + " valores positivos");
    
    }
    
}