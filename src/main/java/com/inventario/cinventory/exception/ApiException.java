package com.inventario.cinventory.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private final String mensaje;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;

    public ApiException(String mensaje, HttpStatus httpStatus, ZonedDateTime timestamp) {
        this.mensaje = mensaje;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public String getMensaje() {
        return mensaje;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
