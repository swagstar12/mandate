package com.starhealth.mandate_wrapper.client;

import org.springframework.http.HttpStatusCode;
import lombok.Getter;

@Getter
public class JuspayApiException extends RuntimeException {
    private final HttpStatusCode statusCode;
    private final String responseBody;

    public JuspayApiException(HttpStatusCode statusCode, String responseBody) {
        super(responseBody);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }
}
