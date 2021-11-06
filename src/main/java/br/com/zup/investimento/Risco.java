package br.com.zup.investimento;

public enum Risco {
    ALTO (0.025), MEDIO (0.015), BAIXO(0.05);

    private double taxaDeRisco;

    Risco(double taxaDeRisco) {
        this.taxaDeRisco = taxaDeRisco;
    }

    public double getTaxaDeRisco() {
        return taxaDeRisco;
    }
}
