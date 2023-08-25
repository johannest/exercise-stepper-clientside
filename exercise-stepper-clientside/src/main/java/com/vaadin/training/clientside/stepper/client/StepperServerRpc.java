package com.vaadin.training.clientside.stepper.client;

import com.vaadin.shared.communication.ServerRpc;

public interface StepperServerRpc extends ServerRpc {

    public void setValue(Integer value);

}
