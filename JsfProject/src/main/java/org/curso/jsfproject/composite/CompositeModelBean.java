/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.curso.jsfproject.composite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.inject.Named;
import org.curso.jsfproject.model.Car;

/**
 *
 * @author Mauri
 */
@Named("compositeModelBean")
@RequestScoped
public class CompositeModelBean implements Serializable {

    private List<Car> cars;
    private Car car;

    @PostConstruct
    public void init() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car("Z4", "Gris"));
        this.cars.add(new Car("Audi", "Azul"));
        this.car = cars.get(0);
    }

    public void componentAction() {
        System.out.println("---- componentAction ----");
        System.out.println(this.car.toString());
    }

    public ActionListener getSomeActionActionListener() {
        return new ActionListener() {

            @Override
            public void processAction(ActionEvent event) throws AbortProcessingException {
                System.out.println("---- getSomeActionActionListener:processAction ----");
                System.out.println("event:" + event.toString());
            }

        };
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
