package org.curso.jsfproject;

import java.io.Serializable;
import javax.inject.Named;

@Named("contextParamBean")
@javax.enterprise.context.RequestScoped
public class ContextParamBean implements Serializable {

    private String vacio;

    public String getVacio() {
        return vacio;
    }

    public void setVacio(String vacio) {
        this.vacio = vacio;
    }
    
    public void saveData(){
        System.out.println("Vacio tiene el valor:" + vacio);
    }

}
