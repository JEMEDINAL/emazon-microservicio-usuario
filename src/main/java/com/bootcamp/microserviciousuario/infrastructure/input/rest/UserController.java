package com.bootcamp.microserviciousuario.infrastructure.input.rest;

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

import static com.bootcamp.microserviciousuario.infrastructure.constantsinfrastructure.Constants.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final IUsersHandler iUsersHandler;
    @PostMapping
    public ResponseEntity<ApiResponse<UserRequestDto>> saveUser(@RequestBody UserRequestDto userRequestDto){
        iUsersHandler.saveUsers(userRequestDto);
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK,SUCCESS_SAVE_USER,userRequestDto));
    }
}
