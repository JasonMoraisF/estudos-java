package Atividades.ficha1udemy;
import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;
public class exercicio6ficha1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A;
        double B;
        double C;
        double tria;
        double circulo;
        double trap;
        double quadrado;
        double retan;
        System.out.print("Digite 3 valores com pontos flutuantes: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        tria = A * C;
        retan = A * B;
        quadrado = B * B;
        trap = (A + B) * C;
        circulo = C * Math.PI;
        System.out.printf("TRIANGULO = %.3f%n", tria);
        System.out.printf("CIRCULO = %.3f%n", circulo);
        System.out.printf("TRAPEZIO = %.3f%n", trap);
        System.out.printf("QUADRADO = %.3f%n", quadrado);
        System.out.printf("RETANGULO = %.3f%n", retan);

        sc.close();




        
    }
}
