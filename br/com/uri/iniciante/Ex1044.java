package br.com.uri.iniciante;
import java.util.Scanner;

public class Ex1044 {
    public static void main(String[]args){
        int A, B;
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();
        
        int x = A%B;
        int y = B%A;
        
        if((x == 0)||(y ==0)){
            System.out.println("Sao Multiplos");
        }else{System.out.println("Nao sao Multiplos");}
    }
}