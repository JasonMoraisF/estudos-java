package ExercicioAbstracao.src.entities;

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
        
        double saudeImposto =0;
        if(saudeGasto > 0){
            saudeImposto = (saudeGasto/2);
        }
        if(getRendaAnual() <= 20000.00){
            return ((getRendaAnual() * 0.15) - saudeImposto);
            
        }
        else{
            return ((getRendaAnual() * 0.25) - saudeImposto);
             
        }
    }

    
    
}
