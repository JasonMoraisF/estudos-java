package Atividades.ficha6udemy2023.Atividade1Vetores.src;

import java.util.Scanner;
import java.util.Vector;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um numero de 0 a 10");
        int n = sc.nextInt();
        int[] vect = new int[n];
        
        if(n <= 10 && n >= 0){ 
            for(int i = 0; i < n; i ++){
                System.out.println("Digite o " + (i+1) + "° número: ");
                vect[i] = sc.nextInt();
            }
            for(int i = 0; i < vect.length; i++){
                if(vect[i] < 0){
                    System.out.println(vect[i]);       
                }
            }
        }
        else{
            System.out.println("MENOR OU IGUAL A 10 lindo: ");
            System.out.println("Rode novamente o programa que se foda");
        }
    }
}
