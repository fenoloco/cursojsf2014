package org.curso.jsfproject.deltaspike.scopes.faces;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import org.curso.jsfproject.scopes.*;

@Named("applicationControllerDS")
@javax.faces.bean.ApplicationScoped
public class ApplicationControllerDS extends AbstractTestScopeController implements Serializable {

    public ApplicationControllerDS() {
        tag = this.getClass().getSimpleName();
        createDate = new Date();
        System.out.println(tag + "- Contructor");
    }

}
