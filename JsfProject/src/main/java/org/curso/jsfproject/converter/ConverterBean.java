/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.curso.jsfproject.converter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.curso.jsfproject.model.Car;

/**
 *
 * @author Mauri
 */
@Named("converterBean")
@RequestScoped
public class ConverterBean implements Serializable {

    private Boolean booleanValue;
    private Long longValue;
    private Double doubleValue;

    private List<Car> cars;
    private Car selectedCar;

    private Date now;
    

    @PostConstruct
    public void init() {
        this.booleanValue = false;
        this.longValue = 12l;
        this.doubleValue = 127.5d;

        this.cars = new ArrayList<Car>();
        this.cars.add(new Car("Honda", "Gris"));
        this.cars.add(new Car("Audi", "Azul"));
        this.selectedCar = cars.get(0);

        this.now = new Date();
    }

    public Boolean getBooleanValue() {
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

    public void submitAction() {
        System.out.println("booleanValue:" + booleanValue);
        System.out.println("longValue:" + longValue);
        System.out.println("doubleValue:" + doubleValue);
        System.out.println("selectedCar:" + selectedCar);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

}
