package Atividades.ficha2udemy;
import java.util.Scanner;

public class exercicio3ficha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B; 

        System.out.println("Diginte 2 Numeros Inteiros");
        A = sc.nextInt();
        B = sc.nextInt();

        if(A > B){
        if(A % B == 0){
            System.out.println("São Multiplos");
        }
    }
        else if(B % A == 0){
            System.out.println("São Multiplos");
            
        }else{
            System.out.println("Não São Multiplos");
        }
        
        sc.close();
    }
}
