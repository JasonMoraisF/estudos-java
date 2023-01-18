package Atividades.ficha4udemy;
import java.util.Scanner;

public class atividade2ficha4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x, n;
        int soma = 0;
        int resto = 0;

        System.out.println("Digite uma quantidade de valores: ");
        x = sc.nextInt();
        System.out.println("Agora digite " + x + " valores inteiros: ");

        for(int y = 0; y < x; y++){
            n = sc.nextInt();
            if( n < 20 && n > 10){
                soma += 1;
            }
            else{
                resto += 1;
            }
            
        }
            System.out.println(soma + " in");
            System.out.println(resto + " out");
            
                        sc.close();
    }
    
    
}
