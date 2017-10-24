package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.Banting;
import com.henco.dietapp.Repositories.BantingRepository;

import com.henco.dietapp.Services.BantingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BantingServiceImpl implements BantingService {

    @Autowired
    public BantingRepository bantingRepository;

    @Override
    public Banting save(Banting entity) {
        return bantingRepository.save(entity);
    }

    @Override
    public Banting findById(String s) {
        return bantingRepository.findOne(s);
    }

    @Override
    public Banting update(Banting entity) {
        return bantingRepository.save(entity);
    }

    @Override
    public void delete(Banting entity)
    {
        bantingRepository.delete(entity);
    }
}
