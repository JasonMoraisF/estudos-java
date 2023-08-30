package ExercicioAbstracao.src.entities;

public abstract class contribuintes {
     private String name;
     private Double rendaAnual;



    public contribuintes(){

    }


    public contribuintes(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Double getRendaAnual() {
        return rendaAnual;
    }


    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double impostoPago();

     
}
