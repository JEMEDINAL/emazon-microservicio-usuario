package com.bootcamp.microserviciousuario.infrastructure.input.rest;

import com.bootcamp.microserviciousuario.application.dto.AuthResponse;
import com.bootcamp.microserviciousuario.application.dto.UserRequestDto;
import com.bootcamp.microserviciousuario.application.handler.IUsersHandler;
import com.bootcamp.microserviciousuario.infrastructure.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {
    private final IUsersHandler iUsersHandler;



    @PostMapping("/register")
    public ResponseEntity<AuthResponse> saveUser(@RequestBody UserRequestDto userRequestDto){
        return ResponseEntity.ok(iUsersHandler.saveUsers(userRequestDto));
    }
}
