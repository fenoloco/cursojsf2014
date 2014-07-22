package org.curso.jsfproject;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named
@RequestScoped
public class DebugBean implements Serializable{

    private HtmlInputText inputComponent;
    private String inputValue;
    private HtmlOutputText outputComponent;
    private String outputValue;
    
    
    @PostConstruct
    public void init(){
        log("Contructor");
    }
    
    
    // Actions
    public void action() {
        outputValue = inputValue;
        log("Action:" + inputValue);
    }

    // Getters 
    public HtmlInputText getInputComponent() {
        log(inputComponent);
        return inputComponent;
    }

    public String getInputValue() {
        log(inputValue);
        return inputValue;
    }

    public HtmlOutputText getOutputComponent() {
        log(outputComponent);
        return outputComponent;
    }

    public String getOutputValue() {
        log(outputValue);
        return outputValue;
    }

    // Setters
    public void setInputComponent(HtmlInputText inputComponent) {
        log(inputComponent);
        this.inputComponent = inputComponent;
    }

    public void setInputValue(String inputValue) {
        log(inputValue);
        this.inputValue = inputValue;
    }

    public void setOutputComponent(HtmlOutputText outputComponent) {
        log(outputComponent);
        this.outputComponent = outputComponent;
    }

    // Listeners 
    public void inputChanged(ValueChangeEvent event) {
        log(event.getOldValue() + " to " + event.getNewValue());
    }

    private void log(Object object) {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("DebugBean " + methodName + ": " + object);
    }
}
