package Atividades.ficha3udemy;
import java.util.Scanner;

public class exercicio1ficha3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x, y;

            System.out.println("Digite a senha: ");
            x = 0;

            while(x != 2002){
                x = sc.nextInt();
                if(x != 2002)
                System.out.println("Senha Invalida!");
                else{
                    System.out.println("Senha correta");
                }
            }
            sc.close();
        }
    
}
