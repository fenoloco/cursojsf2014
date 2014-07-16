package org.curso.jsfproject.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("myValidatorException")
public class MyValidator_Exception implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value)
        throws ValidatorException
    {
        System.out.println("MyValidator validate: " + value);
        throw new ValidatorException(new FacesMessage("Validation failed."));
    }

}
