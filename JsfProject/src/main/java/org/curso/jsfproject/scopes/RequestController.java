package org.curso.jsfproject.scopes;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;

@Named("requestController")
@javax.enterprise.context.RequestScoped
public class RequestController extends AbstractTestScopeController implements Serializable {

    public RequestController() {      
        tag = "RequestController";
        createDate = new Date();
        System.out.println(tag + "- Contructor");
    }

}
