package br.com.zup.investimento.service;

import br.com.zup.investimento.Risco;
import br.com.zup.investimento.dto.InvestimentoDTO;
import br.com.zup.investimento.dto.RetornoDTO;
import br.com.zup.investimento.excecoes.InvestimentoInvalido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {

    List<InvestimentoDTO> investimentos = new ArrayList<>();

    //cadastrar investimento
    public void cadastrarInvestimento(InvestimentoDTO investimento) {
        investimentos.add(investimento);
    }

    public RetornoDTO calcularInvestimento(InvestimentoDTO investimento) {
        double taxaDeRendimento = investimento.getRisco().getTaxaDeRisco();
        double valorAplicado = investimento.getValorInvestido();
        int periodoAplicado = investimento.getPeriodoDeAplicacaoMeses();

        double valorDoLucro = 0;
        double valorTotal = valorAplicado;

        for (int i = 0; i < periodoAplicado; i++) {
            valorDoLucro = valorDoLucro + (valorTotal * taxaDeRendimento);
            valorTotal = valorAplicado + valorDoLucro;
        }
        return new RetornoDTO(valorAplicado, valorDoLucro, valorTotal);
    }

    public void consultarRisco(InvestimentoDTO investidorDto) {
        if (investidorDto.getValorInvestido() < 5000 && investidorDto.getRisco().equals(Risco.ALTO)) {
            throw new InvestimentoInvalido("Esse valor é invalido para o tipo de risco");
        }
    }
}
