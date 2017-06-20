package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1018 {
    
    public static void main(String[]args){
    
        int num;
        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        
        int aux = num;

        //while((num < 0)||(num > 1000000)){num = s.nextInt();}
        
        if (aux == 0){
            System.out.println(num);
            System.out.println(cem + " nota(s) de R$ 100,00");
            System.out.println(cinquenta + " nota(s) de R$ 50,00");
            System.out.println(vinte + " nota(s) de R$ 20,00");
            System.out.println(dez + " nota(s) de R$ 10,00");
            System.out.println(cinco + " nota(s) de R$ 5,00");
            System.out.println(dois + " nota(s) de R$ 2,00");
            System.out.println(um + " nota(s) de R$ 1,00");
        }
        
        while(aux != 0){
        
            // 100
            while(aux >= 100){
                cem += 1;
                aux -= 100;
            }     
        
            //50
            while (aux >= 50) {
                cinquenta += 1;
                aux -= 50;
            }

            //20
            while (aux >= 20) {
                vinte += 1;
                aux -= 20;
            }

            //10
            while (aux >= 10) {
                dez += 1;
                aux -= 10;
            }

            //5
            while (aux >= 5) {
                cinco += 1;
                aux -= 5;
            }

            //2
            while (aux >= 2) {
                dois += 1;
                aux -= 2;
            }

            //1
            while (aux >= 1) {
                um += 1;
                aux -= 1;
            }

            if (aux == 0) {
                System.out.println(num);
                System.out.println(cem + " nota(s) de R$ 100,00");
                System.out.println(cinquenta + " nota(s) de R$ 50,00");
                System.out.println(vinte + " nota(s) de R$ 20,00");
                System.out.println(dez + " nota(s) de R$ 10,00");
                System.out.println(cinco + " nota(s) de R$ 5,00");
                System.out.println(dois + " nota(s) de R$ 2,00");
                System.out.println(um + " nota(s) de R$ 1,00");
            }
        }
    }
}
