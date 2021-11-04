package br.com.zup.investimento.service;
import br.com.zup.investimento.dto.InvestimentoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {
    private List<InvestimentoDTO> investidores = new ArrayList<>();

    public void cadastrarInvestimento(InvestimentoDTO investidor) {
        investidores.add(investidor);
    }

    public List<InvestimentoDTO> retornarInvestimentos() {
        return investidores;
    }
}
