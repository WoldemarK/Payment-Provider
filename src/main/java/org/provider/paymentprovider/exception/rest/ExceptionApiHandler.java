package org.provider.paymentprovider.exception.rest;

import org.provider.paymentprovider.exception.NotFoundException;
import org.provider.paymentprovider.exception.ResponseErrorMessage;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionApiHandler {

    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ResponseEntity<ResponseErrorMessage> notFoundException(NotFoundException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ResponseErrorMessage(exception.getMessage()));
    }
}
