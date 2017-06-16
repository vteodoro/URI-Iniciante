package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1002 {
    
    public static void main(String[]args){
        double area;
        double n = 3.14159;
        double raio;
        
        Scanner s = new Scanner(System.in);
        
        raio = s.nextDouble();
        
        area = n * (raio * raio);
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.printf("A=" + df.format(area) + "\n");
        
    }
}
