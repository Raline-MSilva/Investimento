package br.com.zup.investimento;

public enum Risco {

    ALTO(0.025), MEDIO(0.015), BAIXO(0.05);

    private double taxaDeRetorno;

    Risco(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }

    public double getTaxaDeRetorno() {
        return taxaDeRetorno;
    }
}
