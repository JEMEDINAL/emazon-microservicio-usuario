package com.bootcamp.microserviciousuario.domain.usecase.constantsuserusecase;


import java.time.format.DateTimeFormatter;

public final class ConstantsUsecase {
    public static final String FORMAT_DATE_CORRECT = "dd/MM/yyyy";
    public static final DateTimeFormatter DATE_FORMATTER_CONSTANTS = DateTimeFormatter.ofPattern(FORMAT_DATE_CORRECT);
    public static final int MIN_NUMBER_ID_CHARACTER = 7;
    public static final int NEGATIVE_NUMBER = 1;
    public static final int MAX_CHARACTER_NUMBER_PHONE = 13;
    public static final int MIN_AGE = 18;

    private ConstantsUsecase(){

    }
}
