package com.bootcamp.microserviciousuario.application.handler;

import com.bootcamp.microserviciousuario.application.dto.AuthResponse;
import com.bootcamp.microserviciousuario.application.dto.UserRequestDto;

public interface IUsersHandler {
    AuthResponse saveUsers(UserRequestDto userRequestDto);
}
