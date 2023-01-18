package Atividades.ficha2udemy;
import java.util.Scanner;

public class exercicio5ficha2 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    double hotdog = 4.00;
    double xsalad = 4.50;
    double xbacon = 5.00;
    double toast = 2.00;
    double refri = 1.50;
    double total;
    int prod;
    int quanti;
          //ESCREVENDO LOGO A TABELA
        System.out.printf("Seleciona 2 produtos que deseja: %n 1: Cachorro Quente = %.2f%n 2: X-Salada = %.2f%n 3: X-Bacon = %.2f%n 4: Torrada Simples = %.2f%n 5: Refrigerante = %.2f%n", hotdog, xsalad, xbacon, toast, refri);
        prod = sc.nextInt();

            if(prod == 1){
            total = hotdog;
            System.out.println("Quantos cachorros quentes voce quer?");
            quanti = sc.nextInt();
            total = hotdog * quanti;
            System.out.printf("O total é %.2f", total);
            
        }   
            if(prod == 2){
            total = xsalad;
            System.out.println("Quantos X-Salada voce quer?");
            quanti = sc.nextInt();
            total = xsalad * quanti;
            System.out.printf("O total é %.2f", total);
 }
            if(prod == 3){
            total = xbacon;

            System.out.println("Quantos X-Bacon voce quer?");

            quanti = sc.nextInt();
            total = xbacon * quanti;

            System.out.printf("O total é %.2f", total);
}           
            if(prod == 4){
            total = toast;

            System.out.println("Quantas torradas voce quer?");
            quanti = sc.nextInt();
            total = toast * quanti;

            System.out.printf("O total é %.2f", total);
            
}
            if(prod == 5){
            total = refri;

            System.out.println("Quantos refrigerantes voce quer?");
            quanti = sc.nextInt();
            total = refri * quanti;

            System.out.printf("O total é %.2f", total);
}
            sc.close();
 }
}