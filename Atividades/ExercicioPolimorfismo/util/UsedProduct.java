package util;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class UsedProduct extends Product {


    private LocalDate manufactureDate;
    private DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
   
    @Override
    public String priceTag(){
        return super.getName() + " (used) " + " $ " + String.format("%.2f",super.getPrice()) +  "  (Manufacture date: " + manufactureDate.format(fmt1) + ")";
     }
    

}
