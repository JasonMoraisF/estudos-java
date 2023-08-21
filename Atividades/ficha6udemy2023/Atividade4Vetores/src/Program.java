package Atividades.ficha6udemy2023.Atividade4Vetores.src;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int vect[] = new int[n];
        int pares[];
        
        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        ////////////////////////////////////////////////////////
        int qtPares = 0;
        for(int i = 0; i< vect.length; i++){
            if(vect[i] % 2 == 0){
                qtPares++;
            }
        }
        pares = new int[qtPares];
        int contagem = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                pares[contagem] = vect[i];
                contagem++;
            }
        }

        System.out.println("NUMEROS PARES : ");
        for(int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }
        System.out.printf("%nQuantidade de pares: %d", qtPares); 


        sc.close();
    }

}   
