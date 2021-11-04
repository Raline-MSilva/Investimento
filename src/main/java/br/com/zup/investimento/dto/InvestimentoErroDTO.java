package br.com.zup.investimento.dto;

public class InvestimentoErroDTO {
    private String mensagem;
    private String campo;

    public InvestimentoErroDTO(String mensagem, String campo) {
        this.mensagem = mensagem;
        this.campo = campo;
    }

    public String getMensagem() {
        return mensagem;
    }
}
