package org.curso.jsfproject.deltaspike.scopes;

import org.curso.jsfproject.scopes.*;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;


@Named("viewAccessControllerDS")
@org.apache.deltaspike.core.api.scope.ViewAccessScoped
public class ViewAccessControllerDS extends AbstractTestScopeController implements Serializable {

    private int counter = 0;

    public ViewAccessControllerDS() {
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
