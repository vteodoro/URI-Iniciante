package br.com.uri.iniciante;
import java.util.Scanner;

public class Ex1042 {
    public static void main(String[]args) {
        int a , b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        
        int maiorAB = Math.max(a, b);
        int maior = Math.max(maiorAB, c);
        
        int menorAB = Math.min(a, b);
        int menor = Math.min(menorAB, c);
        
        int medio;
        if((a < maior)&&(a > menor)){
            medio = a;
        }
        else if((b < maior)&&(b > menor)){
            medio = b;
        }
        else{
            medio = c;
        }
        
        System.out.println(menor + "\n" + medio + "\n" + maior);
        System.out.println("\n" + a + "\n" + b + "\n" + c);
    }
}