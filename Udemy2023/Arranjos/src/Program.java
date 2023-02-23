package src;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vect = new double [n]; 

        for(int i = 0; i<n; i++ ){
            vect[i] = sc.nextDouble();
        }
        double sum = 0;
        for( int i = 0; i < n; i++){
            sum += vect[i];
            //O "for" foi refeito da mesma forma que o "vect", pois depois do "for" do vect ter sido terminado, ele ira pular para o outro que ira somar todas os valores de cada posição por cada ciclo.
        }
        double avg = sum / n;
        System.out.printf("%nAVERAGE HEIGHT = %.2f",avg);
        sc.close();
    }

}
