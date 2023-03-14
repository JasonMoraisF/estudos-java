package Atividades.ficha6udemy2023.Atividade6Vetores.src;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int vectA[] = new int[n];
        int vectB[] = new int[n];
        int vectC[] = new int[n];
        
        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < vectA.length; i++){
            System.out.printf("%n" + (i+1) + "° = ");
            vectA[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < vectB.length; i++){
            System.out.printf("%n" + (i+1) + "° = ");
            vectB[i] = sc.nextInt();
            
        }
        
        System.out.println("Vetor resultante: ");
        for(int i = 0; i < vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
            System.out.printf("%n" + (i+1) + "° = " + vectC[i]);
            

        }
        

        


    }
}
