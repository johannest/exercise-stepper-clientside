package com.vaadin.training.clientside.stepper.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractFieldConnector;
import com.vaadin.shared.ui.Connect;
import com.vaadin.training.clientside.stepper.Stepper;

@Connect(Stepper.class)
public class StepperConnector extends AbstractFieldConnector {

    StepperServerRpc rpc = RpcProxy.create(StepperServerRpc.class, this);

    public StepperConnector() {
        getWidget().addValueChangeHandler(new ValueChangeHandler<Integer>() {

            @Override
            public void onValueChange(ValueChangeEvent<Integer> event) {
                // TODO: send the changed value to the server using rpc
            }
        });

    }

    @Override
    protected Widget createWidget() {
        return GWT.create(StepperWidget.class);
    }

    @Override
    public StepperWidget getWidget() {
        return (StepperWidget) super.getWidget();
    }

    @Override
    public StepperState getState() {
        return (StepperState) super.getState();
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
        // TODO: set the value set on server side to the widget
    }

}
