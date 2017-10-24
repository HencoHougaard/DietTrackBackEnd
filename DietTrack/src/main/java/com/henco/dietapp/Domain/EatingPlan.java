package com.henco.dietapp.Domain;

import com.henco.dietapp.Domain.Interface.EatingPlanInterface;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Henco on 8/5/2017.
 */
@Entity // This tells Hibernate to make a table out of this class
public class EatingPlan implements EatingPlanInterface, Serializable {

    @Id
    public String id;
    public int day;
    public String foodType;
    public String fluids;

    public EatingPlan() {

    }

    public EatingPlan(Builder builder) {
        this.id = builder.id;
        this.day = builder.day;
        this.foodType = builder.foodType;
        this.fluids = builder.fluids;
    }

    public static class Builder{
        private String id;
        private int day;
        private String foodType;
        private String fluids;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }
        public Builder day(int value){
            this.day = value;
            return this;
        }

        public Builder foodType(String value){
            this.foodType = value;
            return this;
        }

        public Builder fluids(String value){
            this.fluids = value;
            return this;
        }

        public EatingPlan build(){
            return new EatingPlan(this);
        }
    }

    public String getId() {
        return id;
    }

    public int getDay() {
        return day;
    }


    public String getFoodType() {
        return foodType;
    }


    public String getFluids() {
        return fluids;
    }


    public String breakfast() {
        return null;
    }

    public String lunch() {
        return null;
    }

    public String dinner() {
        return null;
    }

    public String snack() {
        return null;
    }

    @Override
    public String toString() {
        return "EatingPlan{" +
                "day=" + day +
                ", foodType='" + foodType + '\'' +
                ", flueds='" + fluids + '\'' +
                '}';
    }
}
