package com.bootcamp.microserviciousuario.domain.spi_output;

import com.bootcamp.microserviciousuario.domain.model.Users;



public interface IUserPersistancePort {
    void saveUser(Users user);
}