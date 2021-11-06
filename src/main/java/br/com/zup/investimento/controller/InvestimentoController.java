package br.com.zup.investimento.controller;

import br.com.zup.investimento.dto.InvestimentoDTO;
import br.com.zup.investimento.dto.RetornoDTO;
import br.com.zup.investimento.service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {
    @Autowired
    private InvestimentoService investimentoService;

    @PutMapping
    public RetornoDTO cadastrarInvestimento (@RequestBody @Valid InvestimentoDTO investimento){
        return investimentoService.calcularInvestimento(investimento);
    }
}
