package UNIT.ficha3severino.AldoProfAtividades;


import java.util.Scanner;                                   
public class exercicio1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double salario;
      System.out.println("Digite seu salario: ");
      salario = sc.nextDouble();

      Salario.calcularSalarioLiquido(salario);


               
               sc.close();
            } 
            
         }
      
    

