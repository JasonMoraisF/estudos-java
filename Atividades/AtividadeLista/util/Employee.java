package Atividades.AtividadeLista.util;

public class Employee {
    private int id = 0;
    private String nome;
    private double salario = 0;


    public void aumentoSalario(double porcentagem){
        double aumento = (this.salario/100) * porcentagem;
        salario += aumento;
    }

    public Employee(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario =salario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return  + id + ", " + nome + "," + salario;
    }

    

    
}
