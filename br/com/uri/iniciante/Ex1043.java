package br.com.uri.iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1043 {
    public static void main(String[]args){
        double A, B, C;
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner s = new Scanner(System.in);
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        
        if((A > (B-C))&&(A < (B+C))){
            
            if((B > (A-C))&&(B < (A+C))){
            
                if((C > (A-B))&&(C < (A+B))){
                    double p = A + B + C;
                    System.out.println("Perimetro = " + df.format(p));
                }
            }
        }else{
            double area = ((A+B) / 2) * C;
            System.out.println("Area = " + df.format(area));
        }
    }
}