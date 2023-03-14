package UNIT.FichasPOO.AldoProfAtividades.Atividade2;

public class IQA {
    public int air;
    public String classificacao;

    public void QualidadeAr(){
        if(air <= 50 ){
            classificacao = "Boa";
            System.out.println(classificacao);
        }
            else if(air <=100){
                classificacao = "Regular";
                System.out.println(classificacao);
            }
            else if(air <= 199){
                classificacao = "Inadequada";
                System.out.println(classificacao);
            }
            else if(air <= 299){
                classificacao = "Má";
                System.out.println(classificacao);
            }
            else if( air <= 399){
                classificacao = "Péssima";
                System.out.println(classificacao);
            }
            else{
                classificacao = "Crítica";
                System.out.println(classificacao);
            }
    }
    public void Efeitos(){
        if(air <= 100){
            System.out.println("Ausência de sintomas.");
        }
            else if(air <= 199){
                System.out.println(" Leve agravamento dos sintomas de pessoas susceptíveis, ...");
            }
            else if(air <= 299){
                System.out.println(" Decréscimo da resistência física e significativo agravamento ...");
            }
            else if(air <= 399){
                System.out.println(" Aparecimento prematuro de certas doenças, ...");
            }
            else {
                System.out.println(" Morte prematura de pessoas doentes e pessoas idosas ...");
            }

    }


}
