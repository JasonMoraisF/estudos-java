package Udemy2023.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;
    
    public double area(){
        double p = (a + b + c)/2.0;
        double result = Math.sqrt(p* (p - a) * (p - b) * (p - c));
        return result;               
        
        /*tambem pode fazer o caminho mais rapido dessa forma:
        
        double p = (a + b + c)/2.0;
        return Math.sqrt(p* (p - a) * (p - b) * (p - c));*/

    }

}
