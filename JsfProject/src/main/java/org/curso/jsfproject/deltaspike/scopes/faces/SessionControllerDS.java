package org.curso.jsfproject.deltaspike.scopes.faces;

import org.curso.jsfproject.scopes.*;
import java.io.Serializable;
import java.util.Date;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named("sessionControllerDS")
@javax.faces.bean.SessionScoped
public class SessionControllerDS extends AbstractTestScopeController implements Serializable {

    public SessionControllerDS() {
        tag = this.getClass().getSimpleName();
        createDate = new Date();
        System.out.println(tag + "- Contructor");
    }

    public void destroySession() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
        session.invalidate();
    }

}
