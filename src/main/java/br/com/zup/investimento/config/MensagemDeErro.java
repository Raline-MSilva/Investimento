package br.com.zup.investimento.config;

public class MensagemDeErro {
    private String mensagem;

    public MensagemDeErro(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
