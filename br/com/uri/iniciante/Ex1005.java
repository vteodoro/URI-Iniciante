package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1005 {

    public static void main(String[]args){
    
        double A;
        double B;
        double MEDIA;
        double pesoA = 3.5; 
        double pesoB = 7.5;
        
        Scanner s = new Scanner(System.in);
               
        A = s.nextDouble();
        B = s.nextDouble();
        
        MEDIA = ((A * pesoA)+(B * pesoB)) / (pesoA + pesoB) ;
        
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("MEDIA = " + df.format(MEDIA));
        
        
    }   
}