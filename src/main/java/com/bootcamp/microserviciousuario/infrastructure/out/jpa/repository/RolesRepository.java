package com.bootcamp.microserviciousuario.infrastructure.out.jpa.repository;

import com.bootcamp.microserviciousuario.infrastructure.out.jpa.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<RolEntity,Long> {
}
