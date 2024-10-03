package com.bootcamp.microserviciousuario.application.handler;

import com.bootcamp.microserviciousuario.application.dto.UserRequestDto;

public interface IUsersHandler {
    void saveUsers(UserRequestDto userRequestDto);
}
