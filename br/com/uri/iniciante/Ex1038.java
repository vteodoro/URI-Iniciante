package br.com.uri.iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[]args){
        int qtd;
        int codigo;
        double total;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        codigo = s.nextInt();
        qtd = s.nextInt();
        
        switch(codigo){
            case 1: 
                total = qtd * 4.00; 
                System.out.println("Total: R$ " + df.format(total));
                break;
                
            case 2: 
                total = qtd * 4.50;
                System.out.println("Total: R$ " + df.format(total));
                break;
            
            case 3: 
                total = qtd * 5.00;
                System.out.println("Total: R$ " + df.format(total));
                break;
            
            case 4:
                total = qtd * 2.00;
                System.out.println("Total: R$ " + df.format(total));
                break;
            
            case 5:
                total = qtd * 1.50;
                System.out.println("Total: R$ " + df.format(total));
                break;
        }
        
        
    }
}
