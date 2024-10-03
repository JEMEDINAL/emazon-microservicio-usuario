package com.bootcamp.microserviciousuario.infrastructure.exceptionhandler;

import com.bootcamp.microserviciousuario.infrastructure.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {
    private static final String MESSAGE = "Message";
    private static final String STATUS = "Status";

    @ExceptionHandler(NotUnderAge.class)
    public ResponseEntity<Map<String,Object>> notUnderAge(NotUnderAge notUnderAge){
        Map<String,Object> response = new HashMap<>();
        response.put(MESSAGE, ExceptionResponse.NOT_UNDER_AGE.getMessage());
        response.put(STATUS, HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(ValidBirthDateUser.class)
    public ResponseEntity<Map<String,Object>> validBirthDate(ValidBirthDateUser validBirthDateUser){
        Map<String,Object> response = new HashMap<>();
        response.put(MESSAGE, ExceptionResponse.VALID_BIRTH_DATE.getMessage());
        response.put(STATUS, HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(ValidIdNumberUser.class)
    public ResponseEntity<Map<String,Object>> validIdNumber(ValidIdNumberUser validIdNumberUser){
        Map<String,Object> response = new HashMap<>();
        response.put(MESSAGE, ExceptionResponse.VALID_ID_NUMBER.getMessage());
        response.put(STATUS, HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(ValidLastNameUser.class)
    public ResponseEntity<Map<String,Object>> validLastName(ValidLastNameUser validLastNameUser){
        Map<String,Object> response = new HashMap<>();
        response.put(MESSAGE, ExceptionResponse.VALID_LAST_NAME.getMessage());
        response.put(STATUS, HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(ValidNameUser.class)
    public ResponseEntity<Map<String,Object>> validNameUser(ValidNameUser nameUser){
        Map<String,Object> response = new HashMap<>();
        response.put(MESSAGE, ExceptionResponse.VALID_NAME.getMessage());
        response.put(STATUS, HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(ValidNumberPhoneUser.class)
    public ResponseEntity<Map<String,Object>> validNumberPhone(ValidNumberPhoneUser validNumberPhoneUser){
        Map<String,Object> response = new HashMap<>();
        response.put(MESSAGE, ExceptionResponse.VALID_NUMBER_PHONE.getMessage());
        response.put(STATUS, HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(NoExistRole.class)
    public ResponseEntity<Map<String,Object>> noExistRole(NoExistRole noExistRole){
        Map<String,Object> response = new HashMap<>();
        response.put(MESSAGE, ExceptionResponse.NOT_EXIST_ROLE.getMessage());
        response.put(STATUS, HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }
}
