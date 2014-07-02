package org.curso.jsfproject.scopes;

import java.io.Serializable;
import java.util.Date;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named("sessionController")
@javax.enterprise.context.SessionScoped
public class SessionController extends AbstractTestScopeController implements Serializable {

    public SessionController() {
        tag = "SessionController";
        createDate = new Date();
        System.out.println("SessionController as " + this.getClass().getName());
        System.out.println(tag + "- Contructor");        
    }

    public void destroySession() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
        session.invalidate();
    }

}
