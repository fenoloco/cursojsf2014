/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.curso.jsfproject.validators;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.validator.BeanValidator;
import javax.inject.Named;
import javax.validation.Validation;
import org.curso.jsfproject.model.User;

/**
 *
 * @author Mauri
 */
@Named("validatorBean")
@RequestScoped
public class ValidatorBean implements Serializable {

    public static final String BEANS_VALIDATION_AVAILABILITY_CACHE_KEY = "javax.faces.BEANS_VALIDATION_AVAILABLE";

    private String username;
    private Boolean booleanValue;
    private Long longValue;
    private Double doubleValue;
    private String stringValue;

    private User user;

    @PostConstruct
    public void init() {
        user = new User();
    }

    public void submitAction() {
        System.out.println("username:" + username);
        System.out.println("booleanValue:" + booleanValue);
        System.out.println("longValue:" + longValue);
        System.out.println("doubleValue:" + doubleValue);
        System.out.println("stringValue:" + stringValue);
    }

    public Boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
