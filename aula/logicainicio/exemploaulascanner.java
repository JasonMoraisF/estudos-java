package aula.logicainicio;
import java.util.Scanner;
public class exemploaulascanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x;
        System.out.println("Digite algo ");
        x = sc.next();
        System.out.println("Voce digitou: " + x);

        sc.close();
    }
    
}
