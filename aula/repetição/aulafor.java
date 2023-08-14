package repetição;
import java.util.Scanner;
public class aulafor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        
        for(int q = 0; q < x; q++){
            int y = sc.nextInt();
            soma = soma + y;
        }
            System.out.println(soma);
    



    }
    
}
