package UNIT.ficha3severino;


public class temperatura {
    public static void main(String[] args) {
        double[] temperaturas = {10, 30, 40, 32, 18, 22, 35};
        double soma = 0;
        for(double i  : temperaturas){
            System.out.println("Os valores das temperaturas são: " + i);
            System.out.println("---------------------------");
        }
        
        
        for(int i = 0; i < temperaturas.length; i ++){
            if(temperaturas[i] > 30){
                System.out.println("Durante a semana, o dia " + i +" passou de 30 graus");
             } 
            soma += temperaturas[i];  
        }
        double operacao = soma / temperaturas.length;
        System.out.println("-------------------------------------------");
        System.out.println("A média das temperaturas foram: " + operacao);
    }
    
}
