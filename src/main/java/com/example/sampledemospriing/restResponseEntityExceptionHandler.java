package com.example.sampledemospriing;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class restResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(sampleException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public errorMessage notFoundError(sampleException exception) {
        errorMessage newError = new errorMessage(HttpStatus.I_AM_A_TEAPOT, exception.getMessage());
        return newError;
    }

}
