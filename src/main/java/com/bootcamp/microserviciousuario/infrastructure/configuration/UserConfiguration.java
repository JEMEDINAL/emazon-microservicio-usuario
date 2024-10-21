package com.bootcamp.microserviciousuario.infrastructure.configuration;

import com.bootcamp.microserviciousuario.domain.api_input.IUsersServicePort;
import com.bootcamp.microserviciousuario.domain.encoder.PasswordEncoder;
import com.bootcamp.microserviciousuario.domain.spi_output.IUserPersistancePort;
import com.bootcamp.microserviciousuario.domain.usecase.UsersUseCase;
import com.bootcamp.microserviciousuario.infrastructure.jwt.JwtService;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.adapter.UserJpaAdapter;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.mapper.UserEntityMapper;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.repository.RolesRepository;
import com.bootcamp.microserviciousuario.infrastructure.out.jpa.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Configuration
@RequiredArgsConstructor
public class UserConfiguration {
    private final UsersRepository usersRepository;
    private final UserEntityMapper userEntityMapper;
    private final RolesRepository rolesRepository;
    private final PasswordEncoder passwordEncoder;
    @Lazy
    private final JwtService jwtService;

    @Bean
    public IUserPersistancePort userPersistancePort(){
        return new UserJpaAdapter(usersRepository,userEntityMapper,rolesRepository,jwtService);
    }

    @Bean
    @Primary
    public IUsersServicePort usersServicePort(){
        return new UsersUseCase(userPersistancePort(),passwordEncoder);
    }
}
