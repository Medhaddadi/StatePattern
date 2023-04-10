package org.example.usingStatePattern;

public class HasMoneyState implements VendingMachineState {
    public void insertMoney() {
        System.out.println("Money has already been inserted");
    }

    public void ejectMoney() {
        System.out.println("Money returned");
    }

    public void dispense() {
        System.out.println("Product dispensed");
    }
}

