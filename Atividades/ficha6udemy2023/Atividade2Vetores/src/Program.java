package Atividades.ficha6udemy2023.Atividade2Vetores.src;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        double soma = 0;
        System.out.println("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o %d numero: ", (i+1));
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        System.out.print("VALORES:");
        for(int i = 0; i < vect.length; i++){
            System.out.print(" " + vect[i] + " ");
        }

        media = soma / n;
        System.out.printf("%nsoma = " + soma + "%nmédia: " + media);


        sc.close();
    }
}
