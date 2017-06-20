package br.com.uri.iniciante;
import java.util.Scanner;

public class Ex1019 {
    public static void main(String[]args){
        int seg;
        Scanner s = new Scanner(System.in);
        seg = s.nextInt();
        
        int horas = seg / 3600;
        int minutos = (seg % 3600)/60;
        int segRestantes = seg % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segRestantes);
        
    }
}