package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.EatingPlan;
import com.henco.dietapp.Repositories.EatingPlanRepository;
import com.henco.dietapp.Services.EatingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EatingPlanServiceImpl implements EatingPlanService {

    @Autowired
    public EatingPlanRepository eatingPlanRepository;

    @Override
    public EatingPlan save(EatingPlan entity) {
        return eatingPlanRepository.save(entity);
    }

    @Override
    public EatingPlan findById(String s) {
        return null;
    }

    @Override
    public EatingPlan update(EatingPlan entity) {
        return eatingPlanRepository.save(entity);
    }

    @Override
    public void delete(EatingPlan entity)
    {
        eatingPlanRepository.delete(entity);
    }
}
