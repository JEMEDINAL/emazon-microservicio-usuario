package com.bootcamp.microserviciousuario.domain.api_input;

import com.bootcamp.microserviciousuario.domain.model.Users;

public interface IUsersServicePort {
    void saveUser(Users user,String birthDate);
}
