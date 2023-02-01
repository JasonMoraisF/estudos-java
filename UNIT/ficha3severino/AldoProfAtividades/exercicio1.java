package UNIT.ficha3severino.AldoProfAtividades;


import java.util.Scanner;                                   
public class exercicio1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double salario, salarioLiquido, desconto;
      Funcionario f1 = new Funcionario("Lucas ", 1500.00);
      

      
      System.out.printf(f1.getNome());
      System.out.println(f1.getSalario());

      f1.setNome("Luan Lucas ");
      f1.setSalario(2000.00);
      
      System.out.printf(f1.getNome());
      System.out.println(f1.getSalario());
      f1.setNome("Luan Lucas");
      f1.setSalario(2000.00);

      System.out.printf(f1.getNome());
      System.out.println(f1.getSalario());

   
         System.out.println("Digite o valor do seu salário bruto: ");
        salario = sc.nextDouble();

            if(salario <=2000){
            System.out.printf("Seu salario liquido é de %.2f e voce esta isento de desconto", salario);
         }
            else if(salario <= 4000){

            desconto = salario * 2/100;
            salarioLiquido = salario - desconto;
            System.out.printf("Seu salario liquido é de %.2f e seu desconto é minimo ", salarioLiquido);
         }
            else if(salario >4000){
            desconto = salario * 4/100;

               if(desconto >=400){
               salarioLiquido = salario - 400;
               System.out.printf("Seu salario liquido é de %.2f e seu desconto é máximo ", salarioLiquido);
               }
               else{
               salarioLiquido = salario - desconto;
               System.out.printf("Seu salario liquido é de %.2f e seu desconto é médio ", salarioLiquido);
               }
               
               
               sc.close();
            } 
            
         }
      
    

