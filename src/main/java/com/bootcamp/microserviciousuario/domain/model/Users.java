package com.bootcamp.microserviciousuario.domain.model;

import java.time.LocalDate;

public class Users {
    private Long id;
    private String name;
    private String lastName;
    private Integer idNumber;
    private String numberPhone;
    private LocalDate birthDate;
    private String email;
    private String password;
    private Integer age;
    private Long rol;

    public Users(Long id, String name, String lastName, Integer idNumber, String numberPhone, LocalDate birthDate, String email, String password, Integer age, Long rol) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.numberPhone = numberPhone;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.age = age;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getRol() {
        return rol;
    }

    public void setRol(Long rol) {
        this.rol = rol;
    }
}
