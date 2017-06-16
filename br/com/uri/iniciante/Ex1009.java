package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex1009 {

    public static void main(String[]args){
        
        String nome;
        double salario;
        double vendas;
        double comissao = 0.15;
        
        Scanner s = new Scanner(System.in);
        
        nome = s.nextLine();
        salario = s.nextDouble();
        vendas = s.nextDouble();
        
        double total = (comissao * vendas) + salario;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("TOTAL = R$ " + df.format(total));
    
    }
    
}
