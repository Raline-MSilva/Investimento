package br.com.zup.investimento.dto;

public class MensagemDeErroDTO {
    private String mensagem;
    private String campo;

    public MensagemDeErroDTO(String mensagem, String campo) {
        this.mensagem = mensagem;
        this.campo = campo;
    }

    public String getMensagem() {
        return mensagem;
    }
}
