package Atividades.ExercicioAbstracao.src.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Atividades.ExercicioAbstracao.src.entities.contribuintes;
import Atividades.ExercicioAbstracao.src.entities.pessoaFisica;
import Atividades.ExercicioAbstracao.src.entities.pessoaJuridica;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double impostoArrecadado = 0;

        List<contribuintes> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Anual income: ");
            double aIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double saudeC = sc.nextDouble();
                list.add(new pessoaFisica(nome, aIncome, saudeC));
            }
            else{
                System.out.print("Number os employees: ");
                int empregados = sc.nextInt();
                list.add(new pessoaJuridica(nome, aIncome, empregados));
            }

            System.out.println("TAXES PAID: ");
            
        }
        for(contribuintes c : list){
                System.out.println(c.getName() + ": $" + String.format("%.2f",c.impostoPago()));
                impostoArrecadado = impostoArrecadado + c.impostoPago();
            }
            System.out.printf("TOTAL TAXES: %.2f", impostoArrecadado);



    }
    
}
