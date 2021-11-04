package br.com.zup.investimento.dto;

public class MensagemDeErroDTO {
    private String mensagem;

    public MensagemDeErroDTO(String mensagem) {
        this.mensagem = mensagem;

    }

    public String getMensagem() {
        return mensagem;
    }
}
