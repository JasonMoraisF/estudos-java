package aula.Construtores.src;

import java.util.Locale;
import java.util.Scanner;

import aula.Construtores.util.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Value: ");
        double price = sc.nextDouble();
        

        Product product = new Product(name, price);

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
