package org.curso.jsfproject.functions;

import java.io.Serializable;
import javax.inject.Named;

@Named("fnController")
@javax.enterprise.context.RequestScoped
public class FnController implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stringVar = "variable";
    private String stringVarUpper = "VARIABLE";
    private String stringVar1 = "variable 1";
    private String stringVar2 = "variable 2";
    private String userName = "admin";

    private String[] stringArray = {"item1", "item2", "item4"};

    public void function(String value) {
        System.out.println("value:" + value);
    }

    public String getStringVar() {
        return stringVar;
    }

    public void setStringVar(String stringVar) {
        this.stringVar = stringVar;
    }

    public String getStringVarUpper() {
        return stringVarUpper;
    }

    public void setStringVarUpper(String stringVarUpper) {
        this.stringVarUpper = stringVarUpper;
    }

    public String getStringVar1() {
        return stringVar1;
    }

    public void setStringVar1(String stringVar1) {
        this.stringVar1 = stringVar1;
    }

    public String getStringVar2() {
        return stringVar2;
    }

    public void setStringVar2(String stringVar2) {
        this.stringVar2 = stringVar2;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
