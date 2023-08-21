package Atividades.ficha6udemy2023.DesafioVetores.src;

import java.util.Scanner;
import Atividades.ficha6udemy2023.DesafioVetores.util.PessoaDadosQuartos;

public class ProgramaQuartos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaDadosQuartos pessoaDados[] = new PessoaDadosQuartos[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Rent #" + (i+1) + ":");
            
            System.out.println("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();
        
            System.out.println("Room: ");
            int quarto = sc.nextInt();

            pessoaDados[quarto] = new PessoaDadosQuartos();
            pessoaDados[quarto].PessoaDadosQuarto(nome, email);
            
        }
        System.out.println("Busy rooms: ");
        for(int i =0; i < pessoaDados.length; i++){
            if(pessoaDados[i] != null){
                System.out.println("Room " + i + " busy: " + pessoaDados[i].getNome() + ", " + pessoaDados[i].getEmail());

            }
        }

        sc.close();

    }
}
