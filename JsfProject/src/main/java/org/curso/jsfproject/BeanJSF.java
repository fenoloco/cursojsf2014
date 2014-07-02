package org.curso.jsfproject;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "beanJSF")
@javax.faces.bean.RequestScoped
public class BeanJSF {

   
    public String getHello(){
        return "soy un bean JSF (Deprecated)";
    }
    
}
