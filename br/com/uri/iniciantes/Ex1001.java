package br.com.uri.iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class Ex1001 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
         int a;
         int b;
         int x;
         
         a = s.nextInt();
         b = s.nextInt();
         x = a + b;
         
         System.out.println("X = " + x);
    }
 
}