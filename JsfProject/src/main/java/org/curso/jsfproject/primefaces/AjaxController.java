package org.curso.jsfproject.primefaces;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.curso.jsfproject.model.Car;
import org.primefaces.context.RequestContext;

@Named("ajaxController")
@org.apache.deltaspike.core.api.scope.ViewAccessScoped
public class AjaxController implements Serializable {

    String input1;
    String input2;
    String input3;
    String selectOne;

    @PostConstruct
    public void init() {
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        boolean initExample = origRequest.getRequestURL().toString().contains("initScript.xhtml");      
        if (initExample) {
            RequestContext.getCurrentInstance().execute("alert('Script from the bean')");
        }
    }

    public void dummyAction() {
        System.out.println("dummyAction");
    }

    public void delayedAction() {
        try {
            System.out.println("Start action");
            Thread.sleep(4000);
            System.out.println("Finish action");
        } catch (InterruptedException ex) {
            Logger.getLogger(AjaxController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actionParam() {
        Car c = new Car("Ford", "blanco");
        RequestContext context = RequestContext.getCurrentInstance();
        context.addCallbackParam("var1", true);
        context.addCallbackParam("car", c);
    }

    public void actionExecuteJS() {
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PrimeFaces.info('Hello from the Backing Bean');");
        context.execute("toExecute();");
    }

    public void actionUpdate() {
        this.input1 = "actionUpdate";
        RequestContext context = RequestContext.getCurrentInstance();
        context.update("form:input1");
    }

    public void action() {
        this.input1 = "action";
    }

    public void actionScroll() {
        RequestContext context = RequestContext.getCurrentInstance();
        context.scrollTo("lastOne");
    }

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public String getInput3() {
        return input3;
    }

    public void setInput3(String input3) {
        this.input3 = input3;
    }

    public String getSelectOne() {
        return selectOne;
    }

    public void setSelectOne(String selectOne) {
        this.selectOne = selectOne;
    }

}
