package com.starhealth.mandate_wrapper.controller;

import com.starhealth.mandate_wrapper.client.JuspayApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(JuspayApiException.class)
    public ResponseEntity<String> handleJuspayError(JuspayApiException ex) {
        return ResponseEntity
                .status(ex.getStatusCode())
                .header("Content-Type", "application/json")
                .body(ex.getResponseBody());
    }
}
