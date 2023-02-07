package Atividades.ficha5udemy2023.exercicio3ficha5;

public class Student {
    public String name;
    public double tri1, tri2, tri3, media;

    public double MediaFinal(){
        media = (tri1 + tri2 + tri3)/ 3;
        return media;
    }

    public void Aprovacao(){
        double falta;
        if(media >= 60){
            System.out.println(" PASS ");
        }
        else{   
            falta = 60 - media;
            System.out.printf(" FAILED %n MISSING : %.2f ", falta);
        }

    }
    
}
