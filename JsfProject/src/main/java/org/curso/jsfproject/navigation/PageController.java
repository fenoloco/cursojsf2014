package org.curso.jsfproject.navigation;

import java.io.Serializable;
import javax.inject.Named;

@Named("pageController")
@javax.enterprise.context.RequestScoped
public class PageController implements Serializable {

    private static final long serialVersionUID = 1L;

    public String processPage1() {
        return "success";
    }

    public String processPage2() {
        return "success";
    }

    public String processOther() {
        return "success";
    }

    public String moveToPage1() {
        return "page1?faces-redirect=true";
    }

    public String moveToPage2() {
        return "page2?faces-redirect=true";
    }

}
