package br.com.uri.iniciante;

import java.util.Scanner;

public class Ex1066 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int par = 0;
        int imp = 0;
        
        for(int i = 0; i < 5 ; i++){
            int[] x = new int[5];
            x[i] = s.nextInt();
            
            if(x[i] % 2 == 0){
                par++;
            }else{
                imp++;
            }         
            
            if(x[i] < 0){
                neg++;
            }
            else if(x[i] > 0){
                pos++;
            }
        }
        
        System.out.println(par + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}
