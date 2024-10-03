package com.bootcamp.microserviciousuario.infrastructure.exceptionhandler;

public enum ExceptionResponse {
    NOT_UNDER_AGE("No Eres mayor de edad y no puede ir vació este campo"),
    VALID_BIRTH_DATE("No puede ir vació la fecha de nacimiento Y debe tener un formato valido : dd/MM/yyyy"),
    VALID_ID_NUMBER("No puede ir vació el numero de identidad, no puede ser menor a 7 caracteres y no puede ser numeros negativos "),
    VALID_LAST_NAME("No puede ir vació el apellido"),
    VALID_NAME("No puede ir vació el nombre"),
    VALID_NUMBER_PHONE("No puede ir vació el numero de celular, debe contener el código del país y no puede superar los 13 caracteres "),
    NOT_EXIST_ROLE("No existe este rol pon uno ya existente");

    private String message;

    ExceptionResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
