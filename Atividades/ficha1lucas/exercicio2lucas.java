package Atividades.ficha1lucas;
import java.util.Scanner;

public class exercicio2lucas {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int anos;
     int totalanos;
     int meses;
     int totalmeses;
     int dias;
     int total;
     System.out.println("Quantos anos voce tem? ");
     anos = sc.nextInt();
     System.out.println("Quantos meses se passaram desde seu ultimo aniversario? ");
     meses = sc.nextInt();
     System.out.println("Quantos dias se passaram desde seu ultimo aniversario? ");
     dias = sc.nextInt();
     totalanos = anos * 365;
     totalmeses = meses * 30;
     total = totalanos + totalmeses + dias;
     System.out.printf("Voce esta vivo há %d dias", total);
     sc.close();

    } 
}
