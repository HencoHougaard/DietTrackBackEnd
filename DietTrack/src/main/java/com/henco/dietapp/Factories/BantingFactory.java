package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.Banting;

import java.util.Map;

public class BantingFactory {

    public static Banting buildBanting(String id, int day, String foodType, String fluids){
        Banting banting = new Banting.Builder()
                .id(id)
                .day(day)
                .foodType(foodType)
                .fluids(fluids)
                .build();
        return banting;
    }

}
