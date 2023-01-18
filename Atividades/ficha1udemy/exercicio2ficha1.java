package Atividades.ficha1udemy;
import java.util.Scanner;
import java.lang.Math;
public class exercicio2ficha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double area;

        System.out.print("Digite o raio do seu circulo em centimentros = ");

        x = sc.nextDouble();
        area = Math.PI * x;
        
        System.out.printf("A área do seu circulo é %.2f", area);

        sc.close();
    }
}
