package ExercicioAbstracao.src.entities;

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
            return (getRendaAnual() * 0.14) ;
        }
        else{
            return (getRendaAnual() * 0.16);
        }
    }
    

}
