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
    @Min(value = 2, message = "Período minimo 2 meses")
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public int getPeriodoDeAplicacaoMeses() {
        return periodoDeAplicacaoMeses;
    }

    public void setPeriodoDeAplicacaoMeses(int periodoDeAplicacaoMeses) {
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }
}
