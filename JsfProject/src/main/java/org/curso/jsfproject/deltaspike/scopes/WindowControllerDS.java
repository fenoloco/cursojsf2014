package org.curso.jsfproject.deltaspike.scopes;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import org.curso.jsfproject.scopes.*;

@Named("windowControllerDS")
@org.apache.deltaspike.core.api.scope.WindowScoped
public class WindowControllerDS extends AbstractTestScopeController implements Serializable {

    private int counter = 0;

    public WindowControllerDS() {
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
