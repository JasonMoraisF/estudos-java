package Atividades.ExercicioAbstracao.src.entities;

public class teste {
    public static void main(String[] args) {
        
        double Renda = 400000;
        int nFuncionarios = 25;
        double totalAPagar = 0;
        if(nFuncionarios > 10){
            totalAPagar = (Renda * 0.14) ;
        }
        else{
            totalAPagar = (Renda * 0.16);
        }
        System.out.println(totalAPagar);
    }


    }

