package br.com.zup.investimento.config;

import br.com.zup.investimento.dto.MensagemDeErroDTO;
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
    public List<MensagemDeErroDTO> manipularExcecoesDeValidacao(MethodArgumentNotValidException exception){

        List<MensagemDeErroDTO> mensagens = new ArrayList<>();

        for (FieldError fieldError : exception.getFieldErrors()){
            mensagens.add(new MensagemDeErroDTO(fieldError.getDefaultMessage(), fieldError.getField()));
        }

        return mensagens;
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemDeErroDTO mensagem(RuntimeException exception){
        return new MensagemDeErroDTO("Risco não encontrado", "");
    }
}
