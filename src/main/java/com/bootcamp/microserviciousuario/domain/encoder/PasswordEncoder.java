package com.bootcamp.microserviciousuario.domain.encoder;

public interface PasswordEncoder {
    String encode(String password);
}
