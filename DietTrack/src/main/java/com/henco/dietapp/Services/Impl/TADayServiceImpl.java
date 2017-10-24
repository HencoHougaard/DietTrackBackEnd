package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.TADay;
import com.henco.dietapp.Repositories.TADayRepository;
import com.henco.dietapp.Services.TADayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TADayServiceImpl implements TADayService {

    @Autowired
    public TADayRepository taDayRepository;

    @Override
    public TADay save(TADay entity) {
        return taDayRepository.save(entity);
    }

    @Override
    public TADay findById(String s) {
        return taDayRepository.findOne(s);
    }


    @Override
    public TADay update(TADay entity) {
        return taDayRepository.save(entity);
    }

    @Override
    public void delete(TADay entity)
    {
        taDayRepository.delete(entity);
    }
}
