package Atividades.ficha6udemy2023.Atividade9Vetores.src;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String pessoaNome[] = new String[n];
        int pessoaIdade[] = new int[n];
        String pessoaMaisVelha = "";
        int idadeMaisVelha = 0;

        for(int i = 0; i < pessoaIdade.length; i++){
            System.out.println("Dados da " + (i + 1) + "° pessoa: ");
            System.out.printf("Nome: ");
            sc.nextLine();
            pessoaNome[i] = sc.nextLine();
            System.out.print("Idade: ");
            pessoaIdade[i] = sc.nextInt();
            if(pessoaIdade[i] > idadeMaisVelha){
                idadeMaisVelha = pessoaIdade[i];
                pessoaMaisVelha = pessoaNome[i];
            }
        }

        System.out.println("Pessoa mais velha = " + pessoaMaisVelha);

        
    }

}
