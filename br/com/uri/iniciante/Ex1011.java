package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1011 {
    
    public static void main(String[]args){
        
        double R;
        
        Scanner s = new Scanner(System.in);
        
        R = s.nextDouble();
        
        double volume = (4.0 / 3) * 3.14159 * (R*R*R);
        
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("VOLUME = " + df.format(volume));
        
    }   
}