package UNIT.ficha3severino.AldoProfAtividades.Atividade3.src;

import java.util.Scanner;

import UNIT.ficha3severino.AldoProfAtividades.Atividade3.util.Elevator;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevator elevador1 = new Elevator();
        int pessoas, totalPessoas;
        elevador1.MostrarTodosOsStatus();
        
        System.out.println("Digite o código de cadastro do elevador: ");
        elevador1.CadastrarElevador();
        elevador1.MostrarTodosOsStatus();

        System.out.println("PRIMEIRA PARADA ");
        pessoas = sc.nextInt();
        elevador1.RegistrarEntrada(pessoas);

        System.out.println("SEGUNDA PARADA ");
        pessoas = sc.nextInt();
        elevador1.RegistrarEntrada(pessoas);

        System.out.println("TERCEIRA PARADA ");
        pessoas = sc.nextInt();
        elevador1.RegistrarEntrada(pessoas);

        System.out.println("QUARTA PARADA "); //exceder limite
        pessoas = sc.nextInt();
        elevador1.RegistrarSaida(pessoas);
        
        System.out.println("QUINTA PARADA, retirada de pessoas "); //saida de 3 pessoas
        pessoas = sc.nextInt();
        elevador1.RegistrarSaida(pessoas);
        
        System.out.println("SEXTA PARADA, retirada de pessoas"); //saida de 2 pessoas
        pessoas = sc.nextInt();
        elevador1.RegistrarSaida(pessoas);
        


    }
}
