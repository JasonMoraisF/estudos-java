package Atividades.ficha6udemy2023.Atividade8Vetores.src;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter um vetor: ");
        int n = sc.nextInt();
        int vect[] = new int[n];
        double total = 0;
        int nPares = 0;
        
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o %d° numero: ", (i+1));
            vect[i] = sc.nextInt();
            if((vect[i] % 2 == 0)){
                nPares++;
                total += vect[i];
            }   
        }
        if(total == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else{
        double media = total/nPares;
        System.out.printf("MEDIA DOS PARES: %.1f", media);
        }


    }
}
