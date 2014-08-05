package org.curso.jsfproject.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import org.curso.jsfproject.model.Car;

@FacesConverter("myCarConverterError")
public class MyCarConverterError implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("MyCarConverterError getAsObject: " + value);
        if (!"".equals(value)) {
            String[] pair = value.split(":");
            if("audi".equalsIgnoreCase(pair[0])){
                
                FacesMessage msg = 
				new FacesMessage("MyCarConverterError", 
						"Audi no es un modelo");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ConverterException(msg);
            }
            return new Car(pair[0], pair[1]);
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println("MyCarConverter getAsString: " + value);
        return String.valueOf(value);
    }

}
