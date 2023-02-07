package Udemy2023.AulaPrincipio;

import java.util.Locale;
import java.util.Scanner;

import Udemy2023.AulaPrincipio.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Value: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();


        
        System.out.println();
        System.out.println("Product Data: " + product);
        
        System.out.println("Enter the number of products to be added in stock: ");
        System.out.println();
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Product Data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Product Data: " + product);




        





        sc.close();
    }
}
