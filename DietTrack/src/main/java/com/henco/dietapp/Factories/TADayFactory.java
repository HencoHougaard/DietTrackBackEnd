package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.TADay;

import java.util.Map;

public class TADayFactory {
    public static TADay buildTADay(String id, int day, String foodType, String fluids){
        TADay taDay = new TADay.Builder()
                .id(id)
                .day(day)
                .foodType(foodType)
                .fluids(fluids)
                .build();
        return taDay;
    }
}
