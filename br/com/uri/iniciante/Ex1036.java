package br.com.uri.iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[]args){
        double A;
        double B;
        double C;
        double delta;
        double x1;
        double x2;
        DecimalFormat df = new DecimalFormat("0.00000");
        Scanner s = new Scanner(System.in);
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        
        delta = (B*B) - (4*A*C);
        
        x1 = (- B + Math.sqrt(delta)) / (2*A); 
        x2 = (- B - Math.sqrt(delta)) / (2*A);
        
        if((delta < 0)||(A == 0)){
            System.out.println("Impossivel calcular");
        }else{
            System.out.println("R1 = " + df.format(x1));
            System.out.println("R2 = " + df.format(x2));
        }
    }
}
