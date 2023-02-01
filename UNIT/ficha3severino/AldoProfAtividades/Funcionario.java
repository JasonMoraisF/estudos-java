package UNIT.ficha3severino.AldoProfAtividades;

public class Funcionario {
    private double salario;
    private String nome;

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public double getSalario(){
        return this.salario;
    }   
    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }

    public void calculoDesconto(){
        double salarioLiquido, desconto; 
        if(this.salario<=2000){
            System.out.printf("Seu salario liquido é de %.2f e voce esta isento de desconto", this.salario);
        }
        else if(this.salario <= 4000){
            desconto = this.salario *2/100;
            salarioLiquido = this.salario - desconto;
            System.out.printf("Seu salario liquido é de %.2f e voce esta isento de desconto", salarioLiquido);
        }
        else if(salario > 4000){
            desconto = this.salario * 4/100;
            if(desconto >=400){
                salarioLiquido = this.salario - 400;
                System.out.printf("Seu salario liquido é de %.2f e voce esta isento de desconto", salarioLiquido);
            }
            else{
                salarioLiquido = this.salario - desconto;
                System.out.printf("Seu salario liquido é de %.2f e voce esta isento de desconto", salarioLiquido);
            }
        }
        
    }
}
