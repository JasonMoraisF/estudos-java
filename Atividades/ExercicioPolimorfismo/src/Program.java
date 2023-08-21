package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.ImportedProduct;
import util.Product;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        String nome;
        Double preco, taxa;


        List<Product> produtos = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            nome = sc.nextLine();
            sc.nextLine();
            System.out.print("Price: ");
            preco = sc.nextDouble();

            if(ch == 'c'){
                produtos.add(new Product(nome, preco));
            }
            else if(ch == 'i'){
                System.out.print("Customs fee: ");
                taxa = sc.nextDouble();
                produtos.add(new ImportedProduct(nome, preco, taxa));
                
            }
        }


        sc.close();

    }   
    
}
