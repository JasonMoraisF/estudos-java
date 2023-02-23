package Atividades.ficha5udemy2023.exercicio4metodosficha5.util;

public class CurrencyConverter {
    
    public static final double IOF = 0.06;

    public static double DolarConverterIOF(double dolar, double quantity){
        double reais = dolar * quantity;
        return reais + reais * IOF;
    }
}
