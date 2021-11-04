package br.com.zup.Investimento.Controller;

import br.com.zup.Investimento.Dto.InvestimentoDTO;
import br.com.zup.Investimento.Service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/investimento")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarInvestidor(@RequestBody @Valid InvestimentoDTO investidor){
        investimentoService.cadastrarInvestidor(investidor);
    }

    @GetMapping
    public List<InvestimentoDTO> exibirInvestidores(){
        return investimentoService.retornarInvestidores();
    }


}
