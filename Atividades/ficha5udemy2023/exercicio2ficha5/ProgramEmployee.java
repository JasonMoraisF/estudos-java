package Atividades.ficha5udemy2023.exercicio2ficha5;

import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee pessoa1 = new Employee();
        double porcentagem;

        System.out.print("Name: ");
        pessoa1.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        pessoa1.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        pessoa1.tax = sc.nextDouble();


        System.out.printf("Employee = "+  pessoa1.name + " , " + pessoa1.NetSalary());

        System.out.printf("%n Which percentage to increase salary? ");
        porcentagem = sc.nextDouble();

        pessoa1.IncreaseSalary(porcentagem);

        
sc.close();

    }
}
