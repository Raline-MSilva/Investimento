package br.com.zup.Investimento.Controller;

import br.com.zup.Investimento.Dto.InvestimentoDTO;
import br.com.zup.Investimento.Service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/investimento")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarInvestidor(InvestimentoDTO investidor){
        investimentoService.cadastrarInvestidor(investidor);
    }


}
