package Atividades.ficha2udemy;
import java.util.Scanner;
public class arquivo8ficha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda;
        double impos;
        double total;
        double sub1, sub2, sub3;


        System.out.println("Qual é a sua renda mensal? ");
        renda = sc.nextDouble();
        if(renda <= 2000.00){
            System.out.println("Isento");
        }
        else if(renda >2000.00 && renda < 3000){
            sub1 = renda - 2000;
            total = sub1/100*8;
            System.out.printf("%.2f%n", total);
        }
        else if(renda >= 3000 && renda < 4500){
            sub1 = 1000;
            sub2 = renda - 3000;
            total = sub1/100*8 + sub2/100*18;
            System.out.printf("%.2f%n", total);
        }
        else if(renda > 4500){
            sub1 = 1000;
            sub2 = 1500;
            sub3 = renda - 4500;
            total = sub1/100*8 + sub2/100*18 + sub3/100*28;
            System.out.printf("%.2f%n", total);
    }
}
}
