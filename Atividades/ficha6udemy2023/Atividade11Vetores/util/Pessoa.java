package Atividades.ficha6udemy2023.Atividade11Vetores.util;

import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double altura[] = new double[n];
        char genero[] = new char[n];
        double maiorAltura = 0;
        double menorAltura = 0;
        double mediaAlturaMulheres = 0;
        double totalAlturaMulheres = 0;
        int totalMulheres = 0;
        int totalHomens = 0;

        for(int i = 0; i < altura.length; i++){
            System.out.println("Altura da " + (i + 1) + "° pessoa");
            altura[i] = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "° pessoa");
            sc.nextLine();
            genero[i] = sc.next().charAt(0);
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
                menorAltura = maiorAltura;
            }
        }
        for(int i = 0; i < altura.length; i++){
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }

        for(int i = 0; i < altura.length; i++){
            if(genero[i] == 'F'){
                totalAlturaMulheres += altura[i];
                totalMulheres++;
            }
        }
        mediaAlturaMulheres = totalAlturaMulheres / totalMulheres;

        for(int i = 0; i < altura.length; i++){
            if(genero[i] == 'M'){
                totalHomens++;
            }
        }
        System.out.println("Menor Altura = " + menorAltura);
        System.out.println("Maior Altura = " + maiorAltura);
        System.out.printf("Media de altura das Mulheres = %.2f%n",  mediaAlturaMulheres);
        System.out.println("Quantidade de homens = " + totalHomens);

        sc.close();
    }
}
