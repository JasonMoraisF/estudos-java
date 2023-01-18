package Atividades.ficha1udemy;
import java.util.Scanner;
public class exercicio5ficha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1code;
        int p2code;
        int p1qua;
        int p2qua;
        double p1va;
        double p2va;
        double total;
        System.out.println("Digite o codigo da peça 1 e depois a peça 2 :");
        p1code = sc.nextInt();
        p2code = sc.nextInt();
        System.out.println("Digite a quantidade que escolheu de peças 1 e depois de peças 2");
        p1qua = sc.nextInt();
        p2qua = sc.nextInt();
        System.out.println("Digite o preço do 1 e depois do 2");
        p1va = sc.nextDouble();
        p2va = sc.nextDouble();
        total = p1qua * p1va + p2qua +p2va;
        System.out.println("Valor a pagar = " + total);

        sc.close();
    }
    
}
