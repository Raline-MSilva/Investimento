package br.com.zup.investimento.config;

import br.com.zup.investimento.excecoes.InvestimentoInvalido;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public List<MensagemDeErro> manipularExcecoesDeValidacao(MethodArgumentNotValidException exception){

        List<MensagemDeErro> mensagens = new ArrayList<>();

        for (FieldError fieldError : exception.getFieldErrors()){
            mensagens.add(new MensagemDeErro(fieldError.getDefaultMessage()));
        }

        return mensagens;
    }

    @ExceptionHandler(InvestimentoInvalido.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public MensagemDeErro manipularExcecoes (InvestimentoInvalido exception){
        return new MensagemDeErro(exception.getMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemDeErro manipularExcecaoRisco (HttpMessageNotReadableException exception){
        return new MensagemDeErro("Risco não encontrado");
    }
}
