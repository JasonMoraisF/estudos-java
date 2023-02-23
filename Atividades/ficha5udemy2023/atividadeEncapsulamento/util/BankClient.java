package Atividades.ficha5udemy2023.atividadeEncapsulamento.util;

import java.util.Scanner;

public class BankClient {


    
    Scanner sc = new Scanner(System.in);
    private String name;
    private int accountNumber;
    private double money;
    
    public BankClient(String name, int accountNumber, double money){
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
    }
    public BankClient(String name, int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }


    public String getName(){
        return name;
    }
    public double getMoney(){
        return money;
    }

    public void setName(String name){
        this.name = name;
    }

    public double TakeMoney(double money){
        this.money = (this.money - money) - 5.00;
        if(this.money < -100){
            System.out.println("SPECIAL CHECK EXPIRED");
        }
        else{
            System.out.println(this.money);
        }
        return this.money;
    }
    public void DepositMoney(double money){
        
        this.money += money;
    }

    public void InitialDeposit(char choose){

        if(choose == 'y'){
        System.out.print("ENTER INITIAL DEPOSIT VALUE: ");
        DepositMoney(sc.nextDouble());
        System.out.println(this.toString());
        }
        else if(choose == 'n'){
            System.out.printf("%nNAME: " + name + "%nACCOUNT NUMBER: " + accountNumber + "%nBALANCE = " + money + "%n");
            
        }
    }
    public String toString(){
        return name 
            + ", " 
            + accountNumber
            + ", "
            + String.format("%.2f", money);
    }

  


    
}
