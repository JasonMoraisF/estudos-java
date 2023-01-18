package Atividades.ficha4udemy;
import java.util.Scanner;

public class atividade7ficha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, quad, cub;
        //quantidade de vezes que o codigo ira rodar,
        N = sc.nextInt();
        //comando que ira fazer os calculos ate chegar em N.
        for(int x = 0; x <= N; x++){
            quad = x*x;
            cub = x*x*x;
            System.out.printf("%d %d %d%n",x ,quad, cub);
        }

        sc.close();
        
    }
    
}
