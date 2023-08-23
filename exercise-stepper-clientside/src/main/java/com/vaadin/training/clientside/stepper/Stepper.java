package com.vaadin.training.clientside.stepper;

import com.vaadin.training.clientside.stepper.client.StepperServerRpc;
import com.vaadin.training.clientside.stepper.client.StepperState;

public class Stepper extends com.vaadin.ui.AbstractField<Integer> {

    private static final long serialVersionUID = 1L;
    private StepperServerRpc rpc = new StepperServerRpc() {

    };

    public Stepper() {
        registerRpc(rpc);
        setInternalValue(0);
    }

    @Override
    public StepperState getState() {
        return (StepperState) super.getState();
    }

    @Override
    public Class<? extends Integer> getType() {
        return Integer.class;
    }
}
