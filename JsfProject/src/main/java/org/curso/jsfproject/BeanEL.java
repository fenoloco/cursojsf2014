package org.curso.jsfproject;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import org.curso.jsfproject.model.Car;

@Named("beanEL")
@javax.enterprise.context.SessionScoped
public class BeanEL implements Serializable {

    String prop1;
    String prop2;
    String prop3;
    String prop4;
    String prop5;

    /**
     * Para mostrar la diferencia de hacer method1() y method el los EL.
     */
    String method1;
    
    Car car;

    @PostConstruct
    public void init() {
        System.out.println("Init beans");
        prop1 = "value prop1";
        prop2 = "value prop2";
        prop3 = "value prop3";
        prop4 = "value prop4";
        prop5 = "value prop5";
        method1 = "Esta es la propiedad de nombre method1";
        car = new Car("Audi", "Negro");
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getProp3() {
        return prop3;
    }

    public void setProp3(String prop3) {
        this.prop3 = prop3;
    }

    public String getProp4() {
        return prop4;
    }

    public void setProp4(String prop4) {
        this.prop4 = prop4;
    }

    public String getProp5() {
        return prop5;
    }

    public void setProp5(String prop5) {
        this.prop5 = prop5;
    }

    public String method1() {
        return "Hello from  method1";
    }

    public String method2(String nombre) {
        return "Hello " + nombre + " from method2";
    }

    public String getMethod1() {
        return method1;
    }

    public void setMethod1(String method1) {
        this.method1 = method1;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    

}
