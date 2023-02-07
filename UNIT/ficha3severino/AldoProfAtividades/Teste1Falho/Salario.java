package UNIT.ficha3severino.AldoProfAtividades;

public class Salario {
    public static void calcularSalarioLiquido(double salario){
        double salarioLiquido, desconto;
        if(salario <=2000){
            System.out.println("Voce esta isento e seu salario é de " + salario);

        }
        else if(salario <=4000){
            desconto = salario * 2/100;
            salarioLiquido = salario - desconto;
            System.out.println("Voce tem o Minimo de taxa, e seu salario é de " + salarioLiquido);
        }
        else {
            desconto = salario * 4/100;
            if(desconto >=400){
                salarioLiquido = salario - 400;
                System.out.println("Voce tem a maxima taxa, e seu salario é de " + salarioLiquido);
            }
            else{
                salarioLiquido = salario - desconto;
                System.out.println("Voce tem uma taxa média, e seu salario é de " +salarioLiquido);
            }
        }

    }
    
}
