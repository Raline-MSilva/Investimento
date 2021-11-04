package br.com.zup.investimento.controller;

import br.com.zup.investimento.dto.InvestimentoDTO;
import br.com.zup.investimento.service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/investimento")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @PutMapping
    public void cadastrar(@RequestBody @Valid InvestimentoDTO investimento){
        investimentoService.cadastrarInvestimento(investimento);
    }

    @GetMapping
    public List<InvestimentoDTO> exibir(){
        return investimentoService.retornarInvestimentos();
    }


}
