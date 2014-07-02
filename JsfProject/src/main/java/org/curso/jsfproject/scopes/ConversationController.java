package org.curso.jsfproject.scopes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.Conversation;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named("conversationController")
@javax.enterprise.context.ConversationScoped
public class ConversationController extends AbstractTestScopeController implements Serializable {

    @Inject
    private Conversation conversation;

    private int lastItemId = 0;
    private List<String> items;

    public ConversationController() {
        tag = "conversationController";
        createDate = new Date();
        System.out.println(tag + "- Contructor");
        items = new ArrayList<String>();
    }

    public void iniciar() {
        System.out.println(tag + "- iniciar");
        if (conversation.isTransient()) {
            System.out.println(tag + "- iniciar");
            conversation.begin();
        }        
    }

    public void finalizar() {
        System.out.println(tag + "- finalizar");
        if (!conversation.isTransient()) {
            conversation.end();
        }
    }

    public void agregar() {
        lastItemId++;
        System.out.println(tag + "- agregar ID:" + lastItemId);
        items.add("Item ID: " + lastItemId);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item nuevo", "Item ID:" + lastItemId));
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

}
