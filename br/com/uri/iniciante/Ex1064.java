package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1064 {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int cont = 0;
    double media = 0;
    for(int i = 0; i <  6; i++){
        double[] x = new double[6];
        x[i] = s.nextDouble();
        if(x[i] >= 0){
            cont ++;
            media += x[i];
        }    
    }
    
    media = media / cont;
    
    System.out.println(cont + " valores positivos");
    System.out.println(media);
    
    }
}
