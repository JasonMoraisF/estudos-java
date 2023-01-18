package Atividades.ficha4udemy;
import java.util.Scanner;
import java.util.ArrayList;

public class atividade3ficha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtTestes;
        double n1, n2, n3, media;
        ArrayList<Double> listaNotas = new ArrayList();

        System.out.println("Digite uma quantidada de testes: ");
        qtTestes = sc.nextInt();

        for(int y = 0; y < qtTestes; y++){
            System.out.println("Digite 3 valores reais com 1 casa decimal: ");
            
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            
            listaNotas.add(media);

        }
        // 1 - 8.3
        // 2 - 6.3
        // 3 - 9.3
        for(int i = 0; i < listaNotas.size(); i++){
            System.out.println(i+1 + " - " + listaNotas.get(i));
        }
        sc.close();
    }
}
