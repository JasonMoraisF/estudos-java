package aula.logicainicio;
import java.util.Scanner;
import java.util.Locale;
public class exemploaulascanner2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x;
        x = sc.nextDouble();
        System.out.printf("Voce digitou: %.2f%n ", x);      
        sc.close();  
    }
    
}
