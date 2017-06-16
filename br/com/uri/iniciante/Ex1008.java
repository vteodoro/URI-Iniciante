package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1008 {

    public static void main(String[]args){
        
        int nFunc;
        int horas;
        double valorH;
        
        Scanner s = new Scanner(System.in);
        
        nFunc = s.nextInt();
        horas = s.nextInt();
        valorH = s.nextDouble();
        
        double salario = horas * valorH;
        
        System.out.println("NUMBER = " + nFunc);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("SALARY = U$ " + df.format(salario));
        
    }
    
}