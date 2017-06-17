package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1014 {
    
    public static void main(String[]args){
        int km;
        double litros;
        
        Scanner s = new Scanner(System.in);
        
        km = s.nextInt();
        litros = s.nextDouble();
        
        double cm = km / litros;
        
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(cm) + " km/l");
    }
}
