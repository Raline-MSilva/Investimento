package br.com.zup.investimento.service;

import br.com.zup.investimento.dto.InvestimentoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {

    List<InvestimentoDTO> investimentos = new ArrayList<>();

    //cadastrar investimento
    public void cadastrarInvestimento (InvestimentoDTO investimento){
        investimentos.add(investimento);
    }
}
