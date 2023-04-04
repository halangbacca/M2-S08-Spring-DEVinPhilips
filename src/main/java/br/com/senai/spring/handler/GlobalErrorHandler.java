package br.com.senai.spring.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ServerErrorException;

@ControllerAdvice
@ResponseBody
public class GlobalErrorHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public RespostaErro naoEncontrado(Exception exception) {
        return new RespostaErro(exception.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ServerErrorException.class)
    public RespostaErro naoEncontrado(ServerErrorException exception) {
        return new RespostaErro(exception.getReason(), exception.getMessage());
    }

}
