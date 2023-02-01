package Atividades.ficha2udemy;
import java.util.Scanner;

public class arquivo4ficha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inicio, fim, total;
        
        System.out.println("Que horas iniciou o jogo? ");
        inicio = sc.nextDouble();

        System.out.println("Que horas o jogo terminou? ");
        fim = sc.nextDouble();

        if(inicio < fim){
            total = inicio - fim;
            System.out.println(total);
        }
        else{
            total = 24 - inicio + fim;
            System.out.println(total);
        }
        sc.close();
    }
    
}
