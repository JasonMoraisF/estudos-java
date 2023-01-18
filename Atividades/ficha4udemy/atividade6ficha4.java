package Atividades.ficha4udemy;
import java.util.Scanner;

public class atividade6ficha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor;

        divisor = sc.nextInt();
        for(int t = 1; t <= divisor; t++){

                if(divisor % t == 0){
                System.out.println(t);
                
         }
            
        }
            sc.close();
     }

}

