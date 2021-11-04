package br.com.zup.investimento.config;

import br.com.zup.investimento.dto.InvestimentoErroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class InvestimentoAdvisor {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public List<InvestimentoErroDTO> manipularExcecoesDeValidacao(MethodArgumentNotValidException exception){

        List<InvestimentoErroDTO> mensagens = new ArrayList<>();

        for (FieldError fieldError : exception.getFieldErrors()){
            mensagens.add(new InvestimentoErroDTO(fieldError.getDefaultMessage(), fieldError.getField()));
        }

        return mensagens;
    }
}