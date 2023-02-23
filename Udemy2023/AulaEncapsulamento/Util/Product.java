package Udemy2023.AulaEncapsulamento.Util;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    public Product(){
        
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public void setName(String name){
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
    public double  getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
   
   
   
    public int getQuantity(){        //Não criar o setQuantity, pois protege a quantidade do meu produto de inconsistências, pois não vai ser todo mundo que poderá altera-lo. Ele só vai mudar se tiver uma entrada, ou saída.
        return quantity;
    }
    



    public double totalValueInStock() {
        double total = price * quantity;
        return total;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
