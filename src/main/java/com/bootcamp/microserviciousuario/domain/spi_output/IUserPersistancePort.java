package com.bootcamp.microserviciousuario.domain.spi_output;

import com.bootcamp.microserviciousuario.application.dto.AuthResponse;
import com.bootcamp.microserviciousuario.domain.model.Users;



public interface IUserPersistancePort {
    AuthResponse saveUser(Users user);
}
