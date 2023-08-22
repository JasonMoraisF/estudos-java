package Atividades.ExercicioAbstracao.src.entities;

public class pessoaJuridica extends contribuintes{
    private int nFuncionarios;

    public pessoaJuridica() {
        super();
    }

    public pessoaJuridica(String name, Double rendaAnual, int nFuncionarios) {
        super(name, rendaAnual);
        this.nFuncionarios = nFuncionarios;
    }

    public int getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }
    

    
    @Override
    public double impostoPago(){
        if(nFuncionarios > 10){
            return (14/100) * getRendaAnual();
        }
        else{
            return (16/100) * getRendaAnual();
        }
    }
    

}
