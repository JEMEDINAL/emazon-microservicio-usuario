package com.bootcamp.microserviciousuario.infrastructure.response;

import org.springframework.http.HttpStatus;

public class ApiResponse<T> {
    private HttpStatus httpStatus;
    private String message;
    private T data;

    public ApiResponse(HttpStatus httpStatus, String message, T data) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.data = data;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
