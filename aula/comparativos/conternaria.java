package comparativos;
import java.util.Scanner;

public class conternaria {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y;

    x = sc.nextInt();
    
    y = (x > 10) ? x*2 : x*3;

    System.out.println(y);
}    
}
