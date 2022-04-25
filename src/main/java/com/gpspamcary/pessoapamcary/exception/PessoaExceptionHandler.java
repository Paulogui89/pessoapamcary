package com.gpspamcary.pessoapamcary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class PessoaExceptionHandler {

    @ExceptionHandler(value = {PessoaNotFoundException.class})
    public ResponseEntity<?> handleUserError(PessoaNotFoundException pessoaNotFoundException){
        HttpStatus notFound = HttpStatus.NOT_FOUND;
        ExceptionHandlerError error = new ExceptionHandlerError(pessoaNotFoundException.getMessage(), pessoaNotFoundException,notFound, ZonedDateTime.now());
        return new ResponseEntity<>(error,notFound);
    }
}