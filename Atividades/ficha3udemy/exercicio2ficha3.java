package Atividades.ficha3udemy;
import java.util.Scanner;

public class exercicio2ficha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite as coordenadas X e Y respectivamente: ");
             x = 1;
             y = 1;

        while (x != 0 || y != 0){

            x = sc.nextInt();
            y = sc.nextInt();

            if(x > 0 && y > 0){
            System.out.println("primeiro");

            }else if (x < 0 && y > 0){
            System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
            System.out.println("terceiro");
            }
            else if (x > 0 && y < 0 ){
            System.out.println("quarto");
            }     
     }
     sc.close();
    }
    
}
