package com.bootcamp.microserviciousuario.infrastructure.out.jpa.repository;

import com.bootcamp.microserviciousuario.infrastructure.out.jpa.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity,Long> {
}
