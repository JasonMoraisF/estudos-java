package UNIT.ficha3severino.AldoProfAtividades.Atividade3.util;

import java.util.Scanner;

public class Elevator {
    Scanner sc = new Scanner(System.in);
    private int code = 0;
    private int limite = 8;
    private int pessoasTransportadas = 0;
    private String status = "Em operação";

    public int ConsultarPessoasTransportadas(){
        return pessoasTransportadas;
    }

    public int ConsultarCodigoDoElevador(){
        return code;
    }

    public String ConsultarStatus(){
        return status;
    }

    public void CadastrarElevador(){
        code = sc.nextInt();
    }
    public void RegistrarEntrada(int pessoasTransportadas){
        int pessoasExcedentes;
        int sobrando;
        this.pessoasTransportadas += pessoasTransportadas;
        if(this.pessoasTransportadas > limite){
            status = "Bloqueado";
            sobrando = this.pessoasTransportadas - limite;
            System.out.println(status + "Excedendo " + sobrando);
            pessoasExcedentes = sc.nextInt();
            this.pessoasTransportadas -= pessoasExcedentes;
            System.out.println(this.pessoasTransportadas);    
        }   
            else{
                status = "Em operação";
                System.out.println(status + " " + this.pessoasTransportadas );
            }

    }
    public void RegistrarSaida(int pessoasTransportadas){
        this.pessoasTransportadas -= pessoasTransportadas;
        if(this.pessoasTransportadas < 0){
            this.pessoasTransportadas = 0;
        }
        System.out.println(this.pessoasTransportadas);

    }
    public void MostrarTodosOsStatus(){
        System.out.printf("%n" + code + "%n" + pessoasTransportadas + "%n" + status + "%n");
    }
    
}
