package br.com.uri.iniciante;
import java.util.Scanner;

public class Ex1035 {
    public static void main(String[]args){
        int A;
        int B;
        int C;
        int D;
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();
        int x = A%2;
        
        if ((B > C) && (D > A) && ((C + D) > (A + B)) && (C > 0) && (D > 0) && (x == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}