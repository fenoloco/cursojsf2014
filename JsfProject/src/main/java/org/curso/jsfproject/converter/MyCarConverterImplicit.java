package org.curso.jsfproject.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.curso.jsfproject.model.Car;

@FacesConverter(forClass = org.curso.jsfproject.model.Car.class)
public class MyCarConverterImplicit implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("MyCarConverterImplicit getAsObject: " + value);
        if (!"".equals(value)) {
            String[] pair = value.split(":");
            return new Car(pair[0], pair[1]);
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println("MyCarConverterImplicit getAsString: " + value);
        return String.valueOf(value);
    }

}
