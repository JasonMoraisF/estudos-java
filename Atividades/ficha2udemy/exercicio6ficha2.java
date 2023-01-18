package Atividades.ficha2udemy;
import java.util.Scanner;

public class exercicio6ficha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Digite um numero e irei lhe dizer em que intervalo ele se encontra: ");
        num = sc.nextDouble();
        if(num > 0 && num < 25){
            System.out.println("0 , 25");
        }
        else if(num > 25 && num < 50){
        System.out.println("25 , 50");
    }
        else if(num > 50 && num < 75){
            System.out.println("50 , 75");
        }
        else if (num > 75 && num < 100){
            System.out.println("75 , 100");
        }
        else{
            System.out.println("Fora de Intervalo");
        }
}
    
}
