package br.com.uri.iniciante;
import java.util.Scanner;

public class Ex1020 {
    public static void main(String[]args){
        int idade;
        Scanner s = new Scanner(System.in);
        idade = s.nextInt();
        
        int anos = idade / 365;
        int mes = 0;
        int mesAux = idade % 365;
        
        while(mesAux >= 30){
            mes += 1;
            mesAux -= 30;
        }
        
        int dias = (idade % 365) - (mes * 30);
        
        System.out.println(anos + " ano(s)\n" + mes + " mes(es)\n" + dias + " dia(s)");
    }
}
