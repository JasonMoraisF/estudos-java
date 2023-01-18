package aula.logicainicio;

public class exemplosaulafuncmat {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.printf(" Raiz quadrada de %.2f = %.2f%n",x ,A);
        System.out.printf(" Raiz Quadrada de %.2f = %.2f%n",y ,B);
        System.out.printf(" Raiz Quadrada de 25 = %.2f%n", C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " eLevado a " + y + " = " + A);
        System.out.println(x + " eLevado ao quadrado = " + B);
        System.out.println(" 5 eLevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z); 
        System.out.println(" Valor absoluto de " + y + " = " + A);
        System.out.println(" Valor absoluto de " + z + " = " + B);
    }
}
