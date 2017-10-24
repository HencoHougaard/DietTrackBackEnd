package com.henco.dietapp.Domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by Henco on 8/5/2017.
 */
@Entity // This tells Hibernate to make a table out of this class
public class TADay extends EatingPlan implements Serializable{

    public TADay() {
    }

    public TADay(Builder builder) {
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

        public TADay build(){
            return new TADay(this);
        }
    }

    @Override
    public String breakfast() {
        return super.breakfast();
    }

    @Override
    public String lunch() {
        return super.lunch();
    }

    @Override
    public String dinner() {
        return super.dinner();
    }

    @Override
    public String snack() {
        return super.snack();
    }
}
