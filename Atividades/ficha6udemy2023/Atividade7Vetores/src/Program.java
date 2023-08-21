package Atividades.ficha6udemy2023.Atividade7Vetores.src;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double media = 0;
        double vect[] = new double[n];
        double total = 0;

        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
            total = total + vect[i];
            media = total/vect.length;
        }
        System.out.printf("Media do vetor = %.3f%n",media);
        
        System.out.println("Elementos abaixo da media: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < media){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
