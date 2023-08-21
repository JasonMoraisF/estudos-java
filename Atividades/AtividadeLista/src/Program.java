package Atividades.AtividadeLista.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Atividades.AtividadeLista.util.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> list = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.println("ID: ");
            int id = sc.nextInt();
            
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Salario: ");
            double salario = sc.nextDouble();

            Employee empregado = new Employee(id,name,salario);

            list.add(empregado);
        }
        System.out.println("Enter the employee ID that will have the salary increased: ");
        int identificacao = sc.nextInt();
        String caso = "";
        for(Employee empregado : list){
            if(empregado.getId() == identificacao ){
                System.out.println("Enter the percentage: ");
                empregado.aumentoSalario(sc.nextDouble());
            }
            else{
                caso = "This id does not exist!";
            }
        }
        System.out.printf(caso + "%n");
        
        
        System.out.println("Employee List: ");
        for(Employee empregado : list){
            System.out.println(empregado.toString());



            sc.close();
        }
    }
}

