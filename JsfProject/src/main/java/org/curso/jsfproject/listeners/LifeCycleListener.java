package org.curso.jsfproject.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LifeCycleListener implements PhaseListener {

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println("");
        System.out.println("============ Start phase:" + event.getPhaseId() + " ============");
    }

    @Override
    public void afterPhase(PhaseEvent event) {
        System.out.println("============ End phase:" + event.getPhaseId() + " ============");
        System.out.println("");
    }

}
