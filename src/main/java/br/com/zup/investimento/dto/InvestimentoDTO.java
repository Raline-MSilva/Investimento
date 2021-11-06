package br.com.zup.investimento.dto;

import br.com.zup.investimento.Risco;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

public class InvestimentoDTO {
   @Email(message = "Email inválido")
    private String email;
    private String nome;
    @CPF(message = "CPF inválido!")
    private String cpf;
    private double valorInvestido;
    //@Min(value = 2, message = "Período minimo 2 meses")
    private int periodoDeAplicacaoMeses;
    private Risco risco;

    public InvestimentoDTO() {
    }

    public InvestimentoDTO(String email, String nome, String cpf, double valorInvestido, int periodoDeAplicacaoMeses,
                           Risco risco) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.valorInvestido = valorInvestido;
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
        this.risco = risco;
    }
}
