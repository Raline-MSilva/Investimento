package br.com.zup.Investimento.Service;

import br.com.zup.Investimento.Dto.InvestimentoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {
    private List<InvestimentoDTO> investidores = new ArrayList<>();

    public void cadastrarInvestidor (InvestimentoDTO investidor){
        investidores.add(investidor);
    }
}
