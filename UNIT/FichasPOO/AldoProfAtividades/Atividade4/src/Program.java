package UNIT.FichasPOO.AldoProfAtividades.Atividade4.src;

import UNIT.FichasPOO.AldoProfAtividades.Atividade4.util.ContaCorrente;

public class Program {
    public static void main(String[] args) {
        ContaCorrente pessoa = new ContaCorrente();

        pessoa.cadastrarConta(101000, "0001", "1324","E" ,2000 );
        System.out.println("SEU ID É: " + pessoa.idConta + "\nSUA AGÊNCIA É: " + pessoa.agencia + "\nSEU TIPO DE CONTA É: " + pessoa.tipo + " \nSEU LIMITE DE CRÉDITO É: " + pessoa.limiteCredito + "\nSEU SALDO É: " + pessoa.saldo);

        pessoa.registrarDeposito(1000);
        System.out.println(pessoa.saldo);
        pessoa.registrarDeposito(500);
        System.out.println(pessoa.saldo);
        
        System.out.println(pessoa.registrarSaque(1000));
        System.out.println("SEU SALDO É: " + pessoa.saldo);
        System.out.println(pessoa.registrarSaque(2000));
        System.out.println("SEU SALDO É: " + pessoa.saldo);
        System.out.println(pessoa.registrarSaque(800));
        System.out.println("SEU SALDO É: " + pessoa.saldo);
       
        //////////////////////////

        ContaCorrente pessoa1 = new ContaCorrente();

        pessoa1.cadastrarConta(101000, "0001", "1324","N" ,2000 );
        System.out.println("SEU ID É: " + pessoa1.idConta + "\nSUA AGÊNCIA É: " + pessoa1.agencia + "\nSEU TIPO DE CONTA É: " + pessoa1.tipo + " \nSEU LIMITE DE CRÉDITO É: " + pessoa1.limiteCredito + "\nSEU SALDO É: " + pessoa1.saldo);

        pessoa1.registrarDeposito(1000);
        System.out.println(pessoa1.saldo);
        pessoa1.registrarDeposito(2000);
        System.out.println(pessoa1.saldo);
        
        System.out.println(pessoa1.registrarSaque(2000));
        System.out.println("SEU SALDO É: " + pessoa1.saldo);
        System.out.println(pessoa1.registrarSaque(3000));
        System.out.println("SEU SALDO É: " + pessoa1.saldo);

    }
}
