package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1015 {
    
    public static void main(String[]args){
        
        double x1;
        double y1;
        double x2;
        double y2;
        
        Scanner s = new Scanner(System.in);
        
        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();
        
        double distancia = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(distancia));   
    }
}