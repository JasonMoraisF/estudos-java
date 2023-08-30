import java.util.Scanner;

import TratamentoDeExcecao.util.Account;
import TratamentoDeExcecao.util.DomaiException;



public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter account data: ");
        int numero = sc.nextInt();
        System.out.print("Holder: ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.print("Initial Balance: ");
        Double valorInicial = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double limiteSaque = sc.nextDouble();
        Account conta = new Account(numero, nome, valorInicial, limiteSaque);
        System.out.print("Enter amount for withdraw: ");
        conta.withdraw(sc.nextDouble());
        System.out.print("New balance: " + conta.getBalance());
        }
        catch(DomaiException e){
            System.out.println("Withdraw error:" + e.getMessage());
        }
        
        
        sc.close();
    }
}

