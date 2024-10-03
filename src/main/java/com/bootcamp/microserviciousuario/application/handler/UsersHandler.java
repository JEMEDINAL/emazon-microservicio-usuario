package com.bootcamp.microserviciousuario.application.handler;

import com.bootcamp.microserviciousuario.application.dto.UserRequestDto;
import com.bootcamp.microserviciousuario.application.mapper.UserRequestMapper;
import com.bootcamp.microserviciousuario.domain.api_input.IUsersServicePort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Transactional
public class UsersHandler implements IUsersHandler{
    private final IUsersServicePort iUsersServicePort;
    private final UserRequestMapper userRequestMapper;

    @Override
    public void saveUsers(UserRequestDto userRequestDto) {
        String birthDate = userRequestDto.getBirthDate();
        iUsersServicePort.saveUser(userRequestMapper.userRequestDtoToUsersDomain(userRequestDto),birthDate);
    }
}
