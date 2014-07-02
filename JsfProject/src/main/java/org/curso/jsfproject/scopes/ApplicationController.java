package org.curso.jsfproject.scopes;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;

@Named("applicationController")
@javax.enterprise.context.ApplicationScoped
public class ApplicationController extends AbstractTestScopeController implements Serializable {

    public ApplicationController() {       
        tag = "ApplicationController";
        createDate = new Date();
        System.out.println(tag + "- Contructor");
    }

}
