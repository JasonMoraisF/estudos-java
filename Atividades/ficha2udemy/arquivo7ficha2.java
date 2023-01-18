package Atividades.ficha2udemy;
import java.util.Scanner;
public class arquivo7ficha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Digiti 2 valores x e y de uma coordenada(1 casa decimal): ");

        System.out.print("X = ");
        x = sc.nextDouble();
        System.out.print("Y = ");
        y = sc.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x > 0 && y == 0){
            System.out.println("Eixo X");
        }
        else if(x < 0 && y == 0){
            System.out.println("Eixo X");
        }
        else if (x == 0  && y > 0){
            System.out.println("Eixo Y");
        }
        else if (x == 0 && y < 0){
            System.out.println("Eixo Y");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0 ){
            System.out.println("Q4");
        }
        else{
            System.out.println("Centro");
        }
        

        
        
    }
    
}
