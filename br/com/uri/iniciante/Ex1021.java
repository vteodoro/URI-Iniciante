package br.com.uri.iniciante;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[]args){
    
        // Time limit exceeded
        
        double num;
        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int umR = 0;
        int cinqC = 0;
        int vinte5C = 0;
        int dezC = 0;
        int cincoC = 0;
        int umC = 0;       
        
        Scanner s = new Scanner(System.in);
        num = s.nextDouble();      
        double aux = num;
        
        if (aux == 0.00){
            System.out.println("NOTAS:");
            System.out.println(cem + " nota(s) de R$ 100,00");
            System.out.println(cinquenta + " nota(s) de R$ 50,00");
            System.out.println(vinte + " nota(s) de R$ 20,00");
            System.out.println(dez + " nota(s) de R$ 10,00");
            System.out.println(cinco + " nota(s) de R$ 5,00");
            System.out.println(dois + " nota(s) de R$ 2,00");
            System.out.println("MOEDAS:");
            System.out.println(umR + " moeda(s) de R$ 1,00");
            System.out.println(cinqC + " moeda(s) de R$ 0,50");
            System.out.println(vinte5C + " moeda(s) de R$ 0,25");
            System.out.println(dezC + " moeda(s) de R$ 0,10");
            System.out.println(cincoC + " moeda(s) de R$ 0,05");
            System.out.println(umC + " moeda(s) de R$ 0,01");
        }
        
        while(aux > 0.00){
        
            //NOTAS
            
            while(aux >= 100.00){
                cem += 1;
                aux -= 100.00;
            }     
        
            while (aux >= 50.00) {
                cinquenta += 1;
                aux -= 50.00;
            }
            
            while (aux >= 20.00) {
                vinte += 1;
                aux -= 20.00;
            }

            while (aux >= 10.00) {
                dez += 1;
                aux -= 10.00;
            }

            while (aux >= 5.00) {
                cinco += 1;
                aux -= 5.00;
            }

            while (aux >= 2.00) {
                dois += 1;
                aux -= 2.00;
            }

            //MOEDAS
            
            while (aux >= 1.00) {
                umR += 1;
                aux -= 1.00;
            }

            while (aux >= 0.50) {
                cinqC += 1;
                aux -= 0.50;
            }

            while (aux >= 0.25) {
                vinte5C += 1;
                aux -= 0.25;
            }

            while (aux >= 0.10) {
                dezC += 1;
                aux -= 0.10;
            }

            while (aux >= 0.05) {
                cincoC += 1;
                aux -= 0.05;
            }

            while (aux >= 0.01) {
                umC += 1;
                aux -= 0.01;
            }

            
            
            if (aux == 0.00) {
                System.out.println("NOTAS:");
                System.out.println(cem + " nota(s) de R$ 100,00");
                System.out.println(cinquenta + " nota(s) de R$ 50,00");
                System.out.println(vinte + " nota(s) de R$ 20,00");
                System.out.println(dez + " nota(s) de R$ 10,00");
                System.out.println(cinco + " nota(s) de R$ 5,00");
                System.out.println(dois + " nota(s) de R$ 2,00");
                System.out.println("MOEDAS:");
                System.out.println(umR + " moeda(s) de R$ 1,00");
                System.out.println(cinqC + " moeda(s) de R$ 0,50");
                System.out.println(vinte5C + " moeda(s) de R$ 0,25");
                System.out.println(dezC + " moeda(s) de R$ 0,10");
                System.out.println(cincoC + " moeda(s) de R$ 0,05");
                System.out.println(umC + " moeda(s) de R$ 0,01");
            }
        }
    }
}