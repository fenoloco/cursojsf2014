package org.curso.jsfproject;

import java.io.Serializable;
import javax.inject.Named;



@Named("beanCDI")
@javax.enterprise.context.RequestScoped
public class BeanCDI implements Serializable{

   
    public String getHello(){
        return "soy un bean CDI";
    }
    
}
