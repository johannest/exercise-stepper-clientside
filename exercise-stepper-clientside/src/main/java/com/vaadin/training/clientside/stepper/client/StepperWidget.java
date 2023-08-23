package com.vaadin.training.clientside.stepper.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IntegerBox;

public class StepperWidget extends HorizontalPanel
        implements ClickHandler, HasValue<Integer> {

    public static final String CLASSNAME = "stepper";

    private IntegerBox integerBox;

    public StepperWidget() {
        setStyleName(CLASSNAME);
        // TODO: Compose the stepper widget out of integer box and two buttons
    }

    @Override
    public void onClick(ClickEvent event) {
        // TODO: Handle button click
    }

    @Override
    public Integer getValue() {
        return integerBox.getValue();
    }

    @Override
    public void setValue(Integer newValue) {
        integerBox.setValue(newValue);
    }

    @Override
    public void setValue(Integer value, boolean fireEvents) {
        integerBox.setValue(value, fireEvents);
    }

    @Override
    public HandlerRegistration addValueChangeHandler(
            ValueChangeHandler<Integer> handler) {
        return integerBox.addValueChangeHandler(handler);
    }
}