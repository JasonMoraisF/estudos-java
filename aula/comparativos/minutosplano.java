package comparativos;
import java.util.Scanner;
public class minutosplano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minutos;
        double mensa = 50;


        System.out.println("Quantos minutos voce utilizou do plano? ");
        minutos = sc.nextDouble();

        if(minutos < 100){
            System.out.println(mensa);
        }
        else{
            mensa += (minutos - 100) * 2;
            System.out.println(mensa);
        }
        sc.close();
    }
}
