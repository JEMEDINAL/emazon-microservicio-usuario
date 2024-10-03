package com.bootcamp.microserviciousuario.infrastructure.out.jpa.adapter;

import com.bootcamp.microserviciousuario.domain.model.Users;
import com.bootcamp.microserviciousuario.domain.spi_output.IUserPersistancePort;
import com.bootcamp.microserviciousuario.infrastructure.exception.NoExistRole;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.entity.RolEntity;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.entity.UsersEntity;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.mapper.UserEntityMapper;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.repository.RolesRepository;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.repository.UsersRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistancePort {
    private final UsersRepository usersRepository;
    private final UserEntityMapper userEntityMapper;
    private final RolesRepository rolesRepository;

    @Override
    public void saveUser(Users user) {
        Long rol = user.getRol();
        RolEntity rolEntity = rolesRepository.findById(rol).orElseThrow(NoExistRole::new);
        UsersEntity usersEntity = userEntityMapper.userDomainToUserEntity(user);
        usersEntity.setRol(rolEntity);

        usersRepository.save(usersEntity);
    }
}
