package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1006 {
    
    public static void main(String[]args){
    
        double A;
        double B;
        double C;
        double MEDIA;
        double pesoA = 2; 
        double pesoB = 3;
        double pesoC = 5;
        
        Scanner s = new Scanner(System.in);
               
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        
        MEDIA = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / (pesoA + pesoB + pesoC) ;
        
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("MEDIA = " + df.format(MEDIA));
        
        
    }   
}