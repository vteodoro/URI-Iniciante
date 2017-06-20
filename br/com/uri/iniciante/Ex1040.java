package br.com.uri.iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[]args){
        double n1;
        double n2;
        double n3;
        double n4;
        double exame;
        double media;
        double mediaFinal;
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner s = new Scanner(System.in);
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        n3 = s.nextDouble();
        n4 = s.nextDouble();
        
        media = (n1*2 + n2*3 + n3*4 + n4*1) / 10;
        
        if(media >= 7.0){
            System.out.println("Media: " + df.format(media) + "\nAluno aprovado.");
        }
        else if(media < 5.0){
            System.out.println("Media: " + df.format(media) + "\nAluno reprovado.");
        }
        else if((media >= 5.0)&&(media <= 6.9)){
            System.out.println("Media: " + df.format(media) + "\nAluno em exame.");
            exame = s.nextDouble();
            System.out.println("Nota do exame: " + exame);
            mediaFinal = (media + exame) / 2;
            
            if(mediaFinal >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + df.format(mediaFinal));
            }else{
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + df.format(mediaFinal));
            }
        }
    }
}
