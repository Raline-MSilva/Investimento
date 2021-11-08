package br.com.zup.investimento.service;

import br.com.zup.investimento.Risco;
import br.com.zup.investimento.dto.InvestimentoDTO;
import br.com.zup.investimento.dto.RetornoDTO;
import br.com.zup.investimento.excecoes.InvestimentoInvalido;
import br.com.zup.investimento.simulacao.Investimento;
import br.com.zup.investimento.simulacao.SimulacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {

    @Autowired
    private SimulacaoRepository simulacaoRepository;

    //cadastrar investimento
    public void cadastrarInvestimento(InvestimentoDTO investimento) {
        Investimento investimento1 = new Investimento();
        investimento.setCpf(investimento.getCpf());
        investimento.setEmail(investimento.getEmail());
        investimento.setRisco(investimento.getRisco());
        investimento.setValorInvestido(investimento.getValorInvestido());
        investimento.setPeriodoDeAplicacaoMeses(investimento.getPeriodoDeAplicacaoMeses());
        simulacaoRepository.save(investimento1);
    }

    //realizar investimento
    public RetornoDTO realizarInvestimento (InvestimentoDTO investimento){
        RetornoDTO retornoDTO = new RetornoDTO();
        consultarRisco(investimento);
        retornoDTO.setValorInvestido(investimento.getValorInvestido());
        cadastrarInvestimento(investimento);
        return retornoDTO;

    }

    //calcular invstimento
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

    //consultar risco
    public void consultarRisco(InvestimentoDTO investidorDto) {
        if (investidorDto.getValorInvestido() < 5000 && investidorDto.getRisco().equals(Risco.ALTO)) {
            //tratar excecao
            throw new InvestimentoInvalido("Esse valor é invalido para o tipo de risco");
        }
    }
}
