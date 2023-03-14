package UNIT.ficha3severino.AldoProfAtividades.Teste1Falho.Teste2.exercicio1.java;

public class Function {

    public double discount(double salario){
        double desconto;
        if(salario<= 2000){
            return 0;
        }
        else if(salario <=4000){
            desconto = salario * 2/100;
            return desconto;
        }
        else(salario > 4000){
            desconto = salario * 4/100;
            if(desconto > 400){
                return 400;
            }
        }

        }
    public double salarioLiquido(){
        
    }
    }
}
