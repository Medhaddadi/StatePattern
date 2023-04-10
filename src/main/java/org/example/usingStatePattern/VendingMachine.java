package org.example.usingStatePattern;

public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        // we start with the state of no money
        currentState = new NoMoneyState();
    }

    //This method sets the current state of the vending machine
    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertMoney() {
        currentState.insertMoney();
        if (currentState instanceof HasMoneyState) {
            setState(new DispenseState());
        }
    }

    public void ejectMoney() {
        currentState.ejectMoney();
        setState(new NoMoneyState());
    }

    public void dispense() {
        currentState.dispense();
        setState(new NoMoneyState());
    }
}
