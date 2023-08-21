package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.ImportedProduct;
import util.Product;
import util.UsedProduct;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        String nome, dataString;
        Double preco, taxa;
        LocalDate data;


        List<Product> produtos = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            nome = sc.next();
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
            else if (ch == 'u'){
                    System.out.println("Manufacture date (DD/MM/YYYY)");
                    dataString = sc.next();
                    data = LocalDate.parse(dataString, fmt1);
                    produtos.add(new UsedProduct(nome, preco, data));
                /* METODO OTIMIZADO 
                 System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
                 */


            }
        }
        System.out.println("PRICE TAGS: ");
        for(Product produto : produtos ){
            String priceTag = produto.priceTag();
            System.out.println(priceTag);
           

        }



        sc.close();

    }   
    
}