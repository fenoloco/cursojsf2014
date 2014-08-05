package org.curso.jsfproject.navigation;

import java.io.Serializable;
import javax.inject.Named;

@Named("paymentController")
@javax.enterprise.context.SessionScoped
public class PaymentController implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean registerCompleted;
    private int orderQty;

    public PaymentController() {

    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public boolean isRegisterCompleted() {
        return registerCompleted;
    }

    public void setRegisterCompleted(boolean registerCompleted) {
        this.registerCompleted = registerCompleted;
    }

    public String gopayment() {
        return "payment";
    }

}
