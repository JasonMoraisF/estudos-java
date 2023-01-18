package aula.TopicosJava;

import java.util.Scanner;

public class BitABitpratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = 0b100000;

        if( (n & mask) != 0 ){
            System.out.println("6 bit verdadeiro");
        }
        else{
            System.out.println("6 bit falso");
        }
        sc.close();
    }
}
