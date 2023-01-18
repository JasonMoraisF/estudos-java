package Atividades.ficha1udemy;
import java.util.Scanner;
public class exercicio3ficha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int dif;
        System.out.println("Digite 2 valores A e B: ");
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println("Agora digite mais dois valores C e D: ");
        C = sc.nextInt();
        D = sc.nextInt();
        dif = A * B - C * D;
        System.out.print("A diferença de valores é " + dif);
        sc.close();
    }
}
