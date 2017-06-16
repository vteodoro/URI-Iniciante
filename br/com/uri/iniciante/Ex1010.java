package br.com.uri.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1010 {

    public static void main(String[]args){
        
        int np1;
        int qtd1;
        double preco1;
        int np2;
        int qtd2;
        double preco2;
        
        Scanner s = new Scanner(System.in);
        
        np1 = s.nextInt();
        qtd1 = s.nextInt();
        preco1 = s.nextDouble();
        
        np2 = s.nextInt();
        qtd2 = s.nextInt(); 
        preco2 = s.nextDouble();
        
        double total1 = qtd1 * preco1;
        double total2 = qtd2 * preco2;
        double total = total1 + total2;
        
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("VALOR A PAGAR: R$ " + df.format(total));
        
    }
}