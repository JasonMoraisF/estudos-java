package Atividades.ficha5udemy2023.exercicio2ficha5;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
       double aumento = grossSalary * percentage/100;
       grossSalary = grossSalary + aumento;
        System.out.println("Updated Data: " + name + " , " + grossSalary);

    }
}
