package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1012 {
   
    public static void main(String[]args){
        
        double A;
        double B;
        double C;
        
        Scanner s = new Scanner(System.in);
        
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        
        double triangulo = (A*C) / 2;
        double circulo = (C*C) * 3.14159;
        double trapezio = ((A+B) / 2) * C;
        double quadrado = B * B;
        double retangulo = A * B;
                
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));
               
    }
    
}
