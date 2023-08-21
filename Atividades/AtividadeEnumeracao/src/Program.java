package Atividades.AtividadeEnumeracao.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Atividades.AtividadeEnumeracao.entities.enums.OrderStatus;
import Atividades.AtividadeEnumeracao.entities.util.Client;
import Atividades.AtividadeEnumeracao.entities.util.Order;
import Atividades.AtividadeEnumeracao.entities.util.OrderItem;
import Atividades.AtividadeEnumeracao.entities.util.Product;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfhms = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);    
        Locale.setDefault(Locale.US);
        

        System.out.println("Enter client data: ");
        System.out.print("Name:");
        String nome = sc.next();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.next();
        System.out.println("Birth date (DD/MM/YYYY)");
        Date nascimento = sdf.parse(sc.next());

        Client cliente = new Client(nome, email, nascimento);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        System.out.println("How many items to this order? ");
        int n = sc.nextInt();
        Date agora = new Date();
        String dataFormatada = sdfhms.format(agora);
        
        Order pedido = new Order(agora, OrderStatus.valueOf(status));
    
        for(int i = 1; i <= n ; i++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.println("Product name: ");
            String name = sc.next();
            System.out.println("Product price: ");
            double price = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantidade = sc.nextInt();
            Product produto = new Product(name, price);
            OrderItem compra = new OrderItem(quantidade, produto);
            pedido.addItem(compra);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + dataFormatada);
        System.out.println("Order Status: " + status);
        System.out.println("Client: " + cliente);
        System.out.println("Order Items: ");
        pedido.percorrerItems();
        System.out.print("Total price: " + pedido.total());
        pedido.total();
            
        
        sc.close();
    }
}
