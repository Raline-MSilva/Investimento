package br.com.zup.investimento.dto;

public class RetornoDTO {

    private double valorInvestido;
    private double totalDoLucuro;
    private double valorTotal;

    public RetornoDTO() {
    }

    public RetornoDTO(double valorInvestido, double totalDoLucuro, double valorTotal) {
        this.valorInvestido = valorInvestido;
        this.totalDoLucuro = totalDoLucuro;
        this.valorTotal = valorTotal;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getTotalDoLucuro() {
        return totalDoLucuro;
    }

    public void setTotalDoLucuro(double totalDoLucuro) {
        this.totalDoLucuro = totalDoLucuro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
