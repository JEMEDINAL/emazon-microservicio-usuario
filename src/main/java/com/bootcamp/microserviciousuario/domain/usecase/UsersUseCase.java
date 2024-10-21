package com.bootcamp.microserviciousuario.domain.usecase;

import com.bootcamp.microserviciousuario.application.dto.AuthResponse;
import com.bootcamp.microserviciousuario.domain.api_input.IUsersServicePort;
import com.bootcamp.microserviciousuario.domain.encoder.PasswordEncoder;
import com.bootcamp.microserviciousuario.domain.model.Users;
import com.bootcamp.microserviciousuario.domain.spi_output.IUserPersistancePort;
import com.bootcamp.microserviciousuario.infrastructure.exception.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static com.bootcamp.microserviciousuario.domain.usecase.constantsuserusecase.ConstantsUsecase.*;

@Service
public class UsersUseCase implements IUsersServicePort {

    private final IUserPersistancePort iUserPersistancePort;
    private final PasswordEncoder passwordEncoder;

    public UsersUseCase(IUserPersistancePort iUserPersistancePort, PasswordEncoder passwordEncoder) {
        this.iUserPersistancePort = iUserPersistancePort;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AuthResponse saveUser(Users user, String birthDate) {
        if(user.getName() == null || user.getName().trim().isEmpty()){
            throw new ValidNameUser();
        }
        if(user.getLastName()== null || user.getLastName().trim().isEmpty() ){
            throw new ValidLastNameUser();
        }
        if(user.getIdNumber() == null || user.getIdNumber()< MIN_NUMBER_ID_CHARACTER || user.getIdNumber() < NEGATIVE_NUMBER){
            throw new ValidIdNumberUser();
        }
        if(!user.getNumberPhone().contains("+") || user.getNumberPhone().trim().isEmpty() || user.getNumberPhone().length() > MAX_CHARACTER_NUMBER_PHONE ){
            throw new ValidNumberPhoneUser();
        }
        if(user.getAge() == null || user.getAge() < MIN_AGE){
            throw new NotUnderAge();
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        LocalDate parseBirthDate = validateAndParseDate(birthDate);
        user.setBirthDate(parseBirthDate);
        return iUserPersistancePort.saveUser(user);
    }

    private LocalDate validateAndParseDate(String dateStr) {
        if (dateStr == null || dateStr.trim().isEmpty()) {
            throw new ValidBirthDateUser();
        }

        try {
            return LocalDate.parse(dateStr, DATE_FORMATTER_CONSTANTS);
        } catch (DateTimeParseException e) {
            throw new ValidBirthDateUser();
        }
    }
}
