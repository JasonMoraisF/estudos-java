package Atividades.ficha5udemy2023.exercicio3ficha5;

import java.util.Scanner;

public class ProgramMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student aluno = new Student();

        System.out.println("ENTER THE STUDENTS NAME: ");
        aluno.name = sc.nextLine();
        System.out.println("FIRST TRIMESTER GRADE: ");
        aluno.tri1 = sc.nextDouble();
        System.out.println("SECOND TRIMESTER GRADE: ");
        aluno.tri2 = sc.nextDouble();
        System.out.println("THIRD TRIMESTER GRADE: ");
        aluno.tri3 = sc.nextDouble();

        System.out.printf(" FINAL GRADE = %.2f %n", aluno.MediaFinal());
        aluno.Aprovacao();




        
    }
}
