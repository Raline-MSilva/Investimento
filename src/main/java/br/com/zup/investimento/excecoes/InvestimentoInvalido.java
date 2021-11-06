package br.com.zup.investimento.excecoes;

public class InvestimentoInvalido extends RuntimeException{
    private String messagem;

    public InvestimentoInvalido(String messagem) {
        this.messagem = messagem;
    }

    public String getMessagem() {
        return messagem;
    }
}
