package Atividades.ExercicioAbstracao.src.entities;

public class pessoaFisica extends contribuintes {
    private double saudeGasto;
    

    public pessoaFisica(){
        super();
    }

    public pessoaFisica(String name, Double rendaAnual, double saudeGasto) {
        super(name, rendaAnual);
        this.saudeGasto = saudeGasto;
    }

    public double getSaudeGasto() {
        return saudeGasto;
    }

    public void setSaudeGasto(double saudeGasto) {
        this.saudeGasto = saudeGasto;
    }

    @Override
    public double impostoPago(){
        double Renda = getRendaAnual();
        double saudeImposto =0;
        if(saudeGasto > 0){
            saudeImposto = saudeGasto + (saudeGasto/2);
        }
        if(Renda <= 20000.00){
            return (15/100) * Renda + saudeImposto;
        }
        else{
            return (25/100) * Renda + saudeImposto;
        }
    }

    
    
}
