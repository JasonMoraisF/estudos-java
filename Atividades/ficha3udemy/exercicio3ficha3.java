package Atividades.ficha3udemy;
import java.util.Scanner;

public class exercicio3ficha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alco1 = 0;
        int gas2 = 0;
        int die3 = 0;
        int pref;
        System.out.printf("Qual combustivel voce prefere:%n 1 = Alcool%n 2 = Gasolina%n 3 = Diesel%n Pressione 4 para acabar.%n");
        pref = sc.nextInt();

        while(pref != 4){
            if(pref == 1){
                alco1 += 1;
                pref = sc.nextInt();
            }
            else if(pref == 2){
                gas2 += 1;
                pref = sc.nextInt();
            }
            else if(pref == 3){
                die3 += 1;
                pref = sc.nextInt();
            }
            else if(pref > 4){
                System.out.println("Digite um valor válido");
                pref = sc.nextInt();
            }
            else{}
            }
            System.out.printf("Muito Obrigado!%n Alcool: %d%n Gasolina: %d%n Diesel: %d%n",alco1, gas2, die3);

        }

    }

