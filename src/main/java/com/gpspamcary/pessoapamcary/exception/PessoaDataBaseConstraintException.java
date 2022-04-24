package com.gpspamcary.pessoapamcary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PessoaDataBaseConstraintException extends RuntimeException {
    public PessoaDataBaseConstraintException(String message) {
        super(message);
    }
}