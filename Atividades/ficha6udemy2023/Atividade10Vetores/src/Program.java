package Atividades.ficha6udemy2023.Atividade10Vetores.src;

import java.util.Scanner;

public class Program {
    public static int media = 6;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        String nome[] = new String[n];
        double nota1[] = new double[n];
        double nota2[] = new double[n];
              
        
        for(int i = 0; i < nome.length; i++){
            System.out.println("Digite o nome, primeira nota e segunda nota do " + (i + 1) + "° aluno:");
            sc.nextLine();
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < nome.length; i++){
            if( ( nota1[i] + nota2[i] ) / 2 >= media){
                System.out.println(nome[i]);
        }
        }

        sc.close();
    }      
}    
    


