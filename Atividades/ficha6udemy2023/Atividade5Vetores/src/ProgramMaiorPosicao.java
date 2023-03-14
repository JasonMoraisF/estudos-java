package Atividades.ficha6udemy2023.Atividade5Vetores.src;

import java.util.Scanner;

public class ProgramMaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce ira digitar? ");
        int numerosDigitados = sc.nextInt();
        double vect[] = new double[numerosDigitados];
        double maiorNumero = 0;
        int posicao = 0;

        for(int i = 0; i <vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
            if(vect[i] > maiorNumero){
                maiorNumero = vect[i];
            }
        }
        for(int i = 0; i < vect.length; i++){
            if(vect[i] == maiorNumero){
                posicao = i;
            }
        }


        System.out.println("Maior Valor = " + maiorNumero);
        System.out.println("Posicao do maior valor = " + posicao);
    } 
}
    
        

    

