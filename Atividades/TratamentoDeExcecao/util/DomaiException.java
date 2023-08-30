package TratamentoDeExcecao.util;

import java.util.InputMismatchException;

public class DomaiException extends InputMismatchException{
    private static final long serialVersionUID = 1L;

    public DomaiException(String msg){
        super(msg);
    }
}
