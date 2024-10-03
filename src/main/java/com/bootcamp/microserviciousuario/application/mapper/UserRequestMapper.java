package com.bootcamp.microserviciousuario.application.mapper;

import com.bootcamp.microserviciousuario.application.dto.UserRequestDto;
import com.bootcamp.microserviciousuario.domain.model.Users;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserRequestMapper {

    @Mapping(target = "birthDate", ignore = true)
    Users userRequestDtoToUsersDomain(UserRequestDto userRequestDto);

}
