package com.henco.dietapp.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Registration implements Serializable {

    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private String gender;
    private Date dateOfBirth;

    public Registration() {
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Registration(Builder builder){
        this.id = builder.id;
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
    }

    public static class Builder{
        private String id;
        private String username;
        private String email;
        private String password;
        private String gender;
        private Date dateOfBirth;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }
        public Builder password(String value){
            this.password = value;
            return this;
        }
        public Builder gender(String value){
            this.gender = value;
            return this;
        }
        public Builder dateOfBirth(Date value){
            this.dateOfBirth = value;
            return this;
        }

        public Registration build(){
            return new Registration(this);
        }
    }

}
