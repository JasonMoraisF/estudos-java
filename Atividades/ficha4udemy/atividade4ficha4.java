package Atividades.ficha4udemy;
import java.util.Scanner;


public class atividade4ficha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPares;
        double d1, d2, resu;


        System.out.println("Quantas divisões deseja fazer?");
        nPares = sc.nextInt();

        for(int x = 0; x < nPares; x++ ){
            System.out.println("Dividendo um :");
            d1 = sc.nextDouble();

            System.out.println("Dividendo dois :");
            d2 = sc.nextDouble();

            if(d1 == 0 || d2 == 0){
                System.out.println("Divisão indisponivel");
                }
            else {
                resu = d1 / d2;
                System.out.println("Resultado = " + resu);
            }
            
            sc.close();

        }


    }
    
}
