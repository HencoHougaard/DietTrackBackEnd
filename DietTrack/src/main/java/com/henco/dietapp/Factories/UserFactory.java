package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.User;

public class UserFactory {

    public static User buildUser(String id, String userName, String sname, int age, String length, String weight, String stomach, String waist, String thigh, String upperBody, String arm)
    {
        User user = new User.Builder()
                .id(id)
                .fname(userName)
                .sname(sname)
                .age(age)
                .length(length)
                .weight(weight)
                .stomach(stomach)
                .waist(waist)
                .thigh(thigh)
                .upperBody(upperBody)
                .arm(arm)
                .build();
        return user;
    }

}
