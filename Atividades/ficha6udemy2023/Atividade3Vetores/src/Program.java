package Atividades.ficha6udemy2023.Atividade3Vetores.src;

import java.util.ArrayList;
import java.util.Scanner;

import Atividades.ficha6udemy2023.Atividade3Vetores.util.PessoaDados;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        PessoaDados[] vect = new PessoaDados[n];
        ArrayList<PessoaDados> pessoasMenorDezesseis = new ArrayList<PessoaDados>(); 
        double sum = 0;
        for(int i = 0; i < vect.length; i++){

            vect[i] = new PessoaDados();

            System.out.println("Digite o nome da " + (i + 1) + "° pessoa: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Digite a idade da " + (i + 1) + "° pessoa: ");
            int idade = sc.nextInt();

            System.out.println("Digite a altura da " + (i + 1) + "° pessoa: ");
            double altura = sc.nextDouble();

            vect[i].setName(name);
            vect[i].setIdade(idade);
            vect[i].setAltura(altura);
            if(vect[i].getIdade() < 16){
                pessoasMenorDezesseis.add(vect[i]);
            }
            sum += vect[i].getAltura();
            
        }
        double mediaAltura = sum / n;
        System.out.printf("%nAltura média: %.2f%n", mediaAltura);
        
        double porcentagem = ((double) pessoasMenorDezesseis.size() / vect.length) * 100;
        System.out.println("Pessoas com menos de 16 anos: "+ porcentagem + "%");

        for(int i = 0; i < pessoasMenorDezesseis.size(); i++){
            System.out.println(pessoasMenorDezesseis.get(i).getName());
            
        }
        

 
        sc.close();
    }
}

