package Udemy2023.course.src.application;

import java.util.Locale;
import java.util.Scanner;
import Udemy2023.entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle(); 
        y = new Triangle();


        System.out.println("Enter the triangules X measure: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        

        System.out.println("Enter the triangules Y measure: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area = %.2f%n Triange Y area = %.2f%n", areaX, areaY);
        
        if(areaX > areaY){
            System.out.println("Area X is bigger");
        }
            else if(areaX == areaY){
            System.out.println("Identical Areas");
        }
            else{
                System.out.println("Area Y is Bigger");
            }

        sc.close();
    }
}
