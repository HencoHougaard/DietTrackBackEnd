package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.Registration;
import com.henco.dietapp.Repositories.RegistrationRepository;
import com.henco.dietapp.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationServiceImpl implements RegistrationService{

    @Autowired
    public RegistrationRepository registrationRepository;

    @Override
    public Registration save(Registration entity) {
        return registrationRepository.save(entity);
    }

    @Override
    public Registration findById(String s) {
        return registrationRepository.findOne(s);
    }

    @Override
    public Registration update(Registration entity) {
        return registrationRepository.save(entity);
    }

    @Override
    public void delete(Registration entity)
    {
        registrationRepository.delete(entity);
    }
}
