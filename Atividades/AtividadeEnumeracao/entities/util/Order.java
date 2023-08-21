package Atividades.AtividadeEnumeracao.entities.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Atividades.AtividadeEnumeracao.entities.enums.OrderStatus;


public class Order {
    private Date moment;
    private OrderStatus status;

    private List <OrderItem> items = new ArrayList<>();

    public Order(){
    }
    
    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public Double total(){
        double sum = 0;
        for (OrderItem c : items){
            sum += c.subTotal();
        }
        return sum;
    }

    public void percorrerItems(){
        for(OrderItem item : items){
            System.out.println(item);
        }
    }



}