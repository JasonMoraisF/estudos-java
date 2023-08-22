package MetodoAbstrato.src.entities;

import MetodoAbstrato.src.entities.enums.Cor;

public abstract class Shape {
    private Cor color;



    public Shape(){
        
    }

    public Shape(Cor color){
        this.color = color;
    }

    public Cor getColor() {
        return color;
    }

    public void setColor(Cor color) {
        this.color = color;
    }

    
    public abstract double area();
}
