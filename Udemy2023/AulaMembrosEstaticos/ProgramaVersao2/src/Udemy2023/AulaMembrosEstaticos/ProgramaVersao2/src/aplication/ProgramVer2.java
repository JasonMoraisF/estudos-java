package Udemy2023.AulaMembrosEstaticos.ProgramaVersao2.src.aplication;

import java.util.Locale;
import java.util.Scanner;

import Udemy2023.AulaMembrosEstaticos.ProgramaVersao2.src.util.Calculator;


public class ProgramVer2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);


sc.close();

    }


}
