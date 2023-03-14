package UNIT.FichasPOO;
import java.util.Scanner;

public class nomenumeroficha3 {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("digite um número");
        String numero = digite.nextLine();
        System.out.println("Seu número é " + numero);
        System.out.println("-------------------------");
        System.out.println("E seus caraceters são:");  
        if( numero.contains("0" )){
            System.out.println("zero");
          }
          else if(numero.contains("1")) {
            System.out.println("um");
          }  
           if(numero.contains("2")) {
            System.out.println("dois");
          }  
           if(numero.contains("3")) {
            System.out.println("três");
          }  
           if(numero.contains("4")) {
            System.out.println("quatro");
          }  
           if(numero.contains("5")) {
            System.out.println("cinco");
          }  
           if(numero.contains("6")) {
            System.out.println("seis");
          }  
         if(numero.contains("7")) {
            System.out.println("sete");
          }  
           if(numero.contains("8")) {
            System.out.println("oito");
          }  
          if(numero.contains("9")) {
            System.out.println("nove");
          }
          digite.close();
    }   
    
}
