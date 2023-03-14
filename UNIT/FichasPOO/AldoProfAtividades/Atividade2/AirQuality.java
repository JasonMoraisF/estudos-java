package UNIT.FichasPOO.AldoProfAtividades.Atividade2;

import java.util.Scanner;

public class AirQuality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQA ar = new IQA();

        System.out.println("DIGITE O INDICE DA QUALIDADE DO AR DA SUA REGIÃO: ");
        ar.air = sc.nextInt();

        ar.QualidadeAr();
        ar.Efeitos();

        
    }
}
