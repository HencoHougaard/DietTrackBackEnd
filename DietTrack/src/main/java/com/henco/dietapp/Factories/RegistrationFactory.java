package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.Registration;

import java.util.Date;
import java.util.Map;

public class RegistrationFactory {
    public static Registration buildRegistration(String id, String username, String email, String password, String gender, Date dateOfBirth){
        Registration registration = new Registration.Builder()
                .id(id)
                .username(username)
                .email(email)
                .password(password)
                .gender(gender)
                .dateOfBirth(dateOfBirth)
                .build();
        return registration;
    }
}
