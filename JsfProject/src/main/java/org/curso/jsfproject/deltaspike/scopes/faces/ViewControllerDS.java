package org.curso.jsfproject.deltaspike.scopes.faces;

import org.curso.jsfproject.scopes.*;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;

@Named("viewControllerDS")
@javax.faces.bean.ViewScoped
public class ViewControllerDS extends AbstractTestScopeController implements Serializable {

    private int counter = 0;

    public ViewControllerDS() {
        tag = this.getClass().getSimpleName();
        createDate = new Date();
        System.out.println(tag + "- Contructor");
    }

    public void add() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
