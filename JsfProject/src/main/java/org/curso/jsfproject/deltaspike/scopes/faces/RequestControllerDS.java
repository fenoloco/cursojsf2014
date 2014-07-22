package org.curso.jsfproject.deltaspike.scopes.faces;

import org.curso.jsfproject.scopes.*;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;

@Named("requestControllerDS")
@javax.faces.bean.RequestScoped
public class RequestControllerDS extends AbstractTestScopeController implements Serializable {

    public RequestControllerDS() {
        tag = this.getClass().getSimpleName();
        createDate = new Date();
        System.out.println(tag + "- Contructor");
    }

}
