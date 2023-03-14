package UNIT.FichasPOO.AldoProfAtividades.Atividade4.util;

public class ContaCorrente {
    public int idConta;
    public String agencia;
    public String numeroConta;
    public String tipo;
    public double saldo = 0;
    public double limiteCredito;

    public void cadastrarConta(int id, String ag, String nrConta, String tipo, double limiteCredito){
        idConta = id;
        agencia = ag;
        numeroConta = nrConta;
        this.tipo = tipo;
        this.limiteCredito = limiteCredito;

    }
    public void registrarDeposito(double valor){
        saldo += valor;
    }
    public boolean registrarSaque(double valor){
        if(tipo == "E" && valor <= (saldo + limiteCredito)){
            saldo -= valor;
                return true;
            }
            else if(tipo == "N" && valor <= saldo){    
                saldo -= valor;
                return true;
            }
            else{
                System.out.println(" SALDO INSUFICIENTE ");
                return false;
            }

        }
    }
    


