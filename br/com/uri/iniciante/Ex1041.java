package br.com.uri.iniciante;
import java.util.Scanner;

public class Ex1041 {
    public static void main(String[]args){
        double x;
        double y;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        
        if((x == 0.0)&&(y == 0)){
            System.out.println("Origem");
        }
        else if((x > 0)&&(y > 0)){
            System.out.println("Q1");
        }
        else if((x < 0)&&(y > 0)){
            System.out.println("Q2");
        }
        else if((x < 0)&&(y < 0)){
            System.out.println("Q3");
        }        
        else if((x > 0)&&(y < 0)){
            System.out.println("Q4");
        }
        else if((x != 0)&&(y == 0)){
            System.out.println("Eixo X");
        }
        else if((x == 0)&&(y != 0)){
            System.out.println("Eixo Y");
        }
    }
}