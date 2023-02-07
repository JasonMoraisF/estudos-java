package Atividades.ficha5udemy2023.atividade1ficha5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();



        System.out.println("Enter the width and weight retangles. ");

        System.out.print("Width:  ");
        retangulo.width = sc.nextDouble();

        System.out.print("Height:  ");
        retangulo.height = sc.nextDouble();

        
        System.out.printf("Area : " + retangulo.Area() + ("%n"));

        
        System.out.printf("Perimeter: " + retangulo.Perimeter() + ("%n"));

        
        System.out.printf("Diagonal: " + retangulo.Diagonal() + ("%n"));

        sc.close();
    }
}
