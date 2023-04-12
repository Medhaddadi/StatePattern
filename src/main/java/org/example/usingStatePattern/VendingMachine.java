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
        // we delegate the work to the current state
        currentState.insertMoney();
        // if the current state is NoMoneyState, we set the state to HasMoneyState
        if (currentState instanceof HasMoneyState) {
            setState(new DispenseState());
        }
    }

    public void ejectMoney() {
        // we delegate the work to the current state
        currentState.ejectMoney();
        // if the current state is HasMoneyState, we set the state to NoMoneyState
        setState(new NoMoneyState());
    }

    public void dispense() {
        // we delegate the work to the current state
        currentState.dispense();
        // if the current state is DispenseState, we set the state to NoMoneyState
        setState(new NoMoneyState());
    }
}
