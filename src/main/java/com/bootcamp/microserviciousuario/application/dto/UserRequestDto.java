package com.bootcamp.microserviciousuario.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    private String name;
    private String lastName;
    private Integer idNumber;
    private String numberPhone;
    private String birthDate;
    private String email;
    private String password;
    private Integer age;
    private Long rol;
}
