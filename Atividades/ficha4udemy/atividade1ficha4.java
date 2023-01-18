package Atividades.ficha4udemy;
import java.util.Scanner;

public class atividade1ficha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um número de 1 a 1000: ");
        x = sc.nextInt();

        for(int y = 1; y < x; y++){

            if(y % 2 == 1 ){
                System.out.println(y);
            }
            else if(x % 2 == 1){
                System.out.println(x);
            }

        }
        sc.close();
    }
    
}
