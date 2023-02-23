package Atividades.ficha5udemy2023.atividadeEncapsulamento.src;

import java.util.Scanner;

import Atividades.ficha5udemy2023.atividadeEncapsulamento.util.BankClient;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinheiro;

        System.out.println("ENTER ACCOUNT HOLDER: ");
        String nome = sc.nextLine();
        System.out.println("ENTER ACCOUNT NUMBER: ");
        int conta = sc.nextInt();
        System.out.println("IS THERE ANY INITIAL DEPOSIT? ( y/n )");
        BankClient cliente = new BankClient(nome, conta);
        char choose = sc.next().charAt(0);

        cliente.InitialDeposit(choose);

        System.out.println("ENTER DEPOSIT VALUE: ");
        dinheiro = sc.nextDouble();
        cliente.DepositMoney(dinheiro);

        System.out.printf("UPDATED ACCOUNT DATA%n" + cliente.toString());
        
        System.out.printf("%nWITHDRAW VALUE: ");
        dinheiro = sc.nextDouble();
        cliente.TakeMoney(dinheiro);
        
        System.out.printf("UPDATED ACCOUNT DATA%n" + cliente.toString());

        


    
       


    
        sc.close();
        
    }
}
