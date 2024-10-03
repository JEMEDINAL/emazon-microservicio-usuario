package com.bootcamp.microserviciousuario.infrastructure.out.jpa.mapper;

import com.bootcamp.microserviciousuario.domain.model.Users;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.entity.UsersEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
    @Mapping(target = "rol", ignore = true)
    UsersEntity userDomainToUserEntity(Users users);
}
