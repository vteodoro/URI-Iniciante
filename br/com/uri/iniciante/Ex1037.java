package br.com.uri.iniciante;
import java.util.Scanner;

public class Ex1037 {
    //Wrong answer
    public static void main(String[]args){
        double entrada; 
        Scanner s = new Scanner(System.in);
        entrada = s.nextDouble();
        
        if((entrada > 0)&&(entrada <= 25)){
            System.out.println("Intervalo [0,25]");
        }
        else if((entrada >25 )&&(entrada <= 50)){
            System.out.println("Intervalo (25,50]");
        }
        else if((entrada > 50)&&(entrada <= 75)){
            System.out.println("Intervalo (50,75]");
        }
        else if((entrada > 75)&&(entrada <= 100)){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}