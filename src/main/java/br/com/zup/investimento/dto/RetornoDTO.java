package br.com.zup.investimento.dto;

public class RetornoDTO {

    private double valorInvestido;
    private double valorLucro;
    private double valorTotal;

    public RetornoDTO() {
    }

    public RetornoDTO(double valorInvestido, double valorLucro, double valorTotal) {
        this.valorInvestido = valorInvestido;
        this.valorLucro = valorLucro;
        this.valorTotal = valorTotal;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getValorLucro() {
        return valorLucro;
    }

    public void setValorLucro(double valorLucro) {
        this.valorLucro = valorLucro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
