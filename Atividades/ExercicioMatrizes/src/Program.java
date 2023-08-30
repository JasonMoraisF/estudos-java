package ExercicioMatrizes.src;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.println("Quantidade de colunas: ");
        int n = sc.nextInt();

        int [][] mat = new int[m][n];

        System.out.println(mat.length);

        for(int i = 0; i < mat.length; i++){
            System.out.println("Linha " + i);
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite um numero inteiro da matriz, para ser mostrado seus numeros vizinhos: ");
        int x = sc.nextInt();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == x){
                    System.out.println("Position " + i +", " + j);
                    if(j > 0 && mat[i][j-1] != 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(j < mat[i].length-1 && mat[i][j+1] != 0){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i < mat.length-1 && mat[i+1][j] != 0){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                     if(i > 0 && mat[i-1][j] != 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    } 
                    

                  
                }
            }
        }




     sc.close();
    }
    
}
