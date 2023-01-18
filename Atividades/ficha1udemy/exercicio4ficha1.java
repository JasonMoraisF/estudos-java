package Atividades.ficha1udemy;
import java.util.Scanner;
public class exercicio4ficha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double salario;
        double horas;
        double total;
        System.out.println("Qual é seu número de serie? ");
        numero = sc.nextInt();
        System.out.println("Quantas horas voce trabalha por dia? ");
        horas = sc.nextDouble();
        System.out.println("Quanto voce recebe por hora? ");
        salario = sc.nextDouble();
        total = salario * horas;
        System.out.println("NUMERO = " + numero);
        System.out.println("SALARIO = " + total);

        sc.close();

    }
}
