package src;

import java.util.Locale;
import java.util.Scanner;
import util.Product;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i< vect.length ; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);

        }
        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
            // Esta acessando o vetor na posição i, e pegando o valor do retorno do getPrice.
            // Pois como o objeto tem varias instancias, é preciso especificar o que precisa.
            
        }
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE %.2f%n", avg);
        
        




        sc.close();
    }
}
