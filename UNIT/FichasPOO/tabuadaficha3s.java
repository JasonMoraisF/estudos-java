package UNIT.FichasPOO;
import java.util.Scanner;

public class tabuadaficha3s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, i, c;

        System.out.println("Digite um numéro para eu lhe mostrar sua tabuada: ");
        x = sc.nextInt();

        System.out.println("Digite ate que numero ele deve ser multiplicado: ");
        i = sc.nextInt();

        for(int z = 0; z <= i; z += 1 ){
            c = x * z;
            System.out.println(x + " x " + i + " = " + c);
        }
            sc.close();
    }    
}
