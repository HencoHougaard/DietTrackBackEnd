package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.EatingPlan;

import java.util.Map;

public class EatingPlanFactory {

    public static EatingPlan buildEatingPlan(String id, int day, String foodType, String fluids){
        EatingPlan eatingPlan = new EatingPlan.Builder()
                .id(id)
                .day(day)
                .foodType(foodType)
                .fluids(fluids)
                .build();
        return eatingPlan;
    }
}
