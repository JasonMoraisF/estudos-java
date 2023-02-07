package Atividades.ficha5udemy2023.atividade1ficha5;

public class Rectangle {
    public double width;
    public double height;


    public double Area(){
        return width * height;
        
    }
    public double Perimeter(){
        return 2*(width + height);
    }
    public double Diagonal(){
        double numeroPow = Math.pow(width, 2) + Math.pow(height, 2);
        double diagonal = Math.sqrt(numeroPow);
        return diagonal;
    }





}
