package com.bootcamp.microserviciousuario.application.handler;

import com.bootcamp.microserviciousuario.application.dto.AuthResponse;
import com.bootcamp.microserviciousuario.application.dto.UserRequestDto;
import com.bootcamp.microserviciousuario.application.mapper.UserRequestMapper;
import com.bootcamp.microserviciousuario.domain.api_input.IUsersServicePort;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsersHandler implements IUsersHandler{

    private final IUsersServicePort iUsersServicePort;
    private final UserRequestMapper userRequestMapper;

    public UsersHandler(@Qualifier("usersServicePort")IUsersServicePort iUsersServicePort, UserRequestMapper userRequestMapper) {
        this.iUsersServicePort = iUsersServicePort;
        this.userRequestMapper = userRequestMapper;
    }

    @Override
    public AuthResponse saveUsers(UserRequestDto userRequestDto) {
        String birthDate = userRequestDto.getBirthDate();
        return iUsersServicePort.saveUser(userRequestMapper.userRequestDtoToUsersDomain(userRequestDto),birthDate);
    }
}
