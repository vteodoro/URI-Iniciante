package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1017 {

    public static void main(String[]args){
        double horas;
        double velMedia;
        double litros;
        
        Scanner s = new Scanner(System.in);
        
        horas = s.nextInt();
        velMedia = s.nextInt();
        
        litros = (velMedia  / 12) * horas;
        
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(litros));
    }
    
}