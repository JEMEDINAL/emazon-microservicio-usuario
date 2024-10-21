package com.bootcamp.microserviciousuario.domain.api_input;

import com.bootcamp.microserviciousuario.application.dto.AuthResponse;
import com.bootcamp.microserviciousuario.domain.model.Users;

public interface IUsersServicePort {
    AuthResponse saveUser(Users user, String birthDate);
}
