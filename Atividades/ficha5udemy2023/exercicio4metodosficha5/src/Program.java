package Atividades.ficha5udemy2023.exercicio4metodosficha5.src;

import java.util.Locale;
import java.util.Scanner;

import Atividades.ficha5udemy2023.exercicio4metodosficha5.util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("What is the dollar price? ");
        double dolar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        System.out.printf("Amount the be paid in Reais: %.2f", CurrencyConverter.DolarConverterIOF(dolar, quantity));

    }
    
}
