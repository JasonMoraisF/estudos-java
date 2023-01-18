package Atividades.ficha1udemy;
import java.util.Scanner;
public class exercicio1ficha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Digite dois valores para serem somados: ");
        x = sc.nextInt();
        System.out.print("O segundo valor: ");
        y = sc.nextInt();
        int soma = x + y;
        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
