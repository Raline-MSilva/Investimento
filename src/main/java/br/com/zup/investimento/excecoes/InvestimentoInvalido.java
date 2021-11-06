package br.com.zup.investimento.excecoes;

public class InvestimentoInvalido extends RuntimeException{
    public InvestimentoInvalido(String message) {
        super(message);
    }


}
