package TratamentoExcecao.TryCatch.src.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        
        metod1();

        System.out.println("End of program");

        
    }
    
    public static void metod1(){
        System.out.println("***Metod 1 start***");

        metod2();

        System.out.println("***Metod 1 end***");
    }

    public static void metod2(){

        System.out.println("***Metod 2 start***");
        Scanner sc = new Scanner(System.in);
        
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        }
        catch(InputMismatchException e){
            System.out.println("Input error!");
            
        } 
        
        sc.close();
        System.out.println("***Metod 2 end***");

    }
}
