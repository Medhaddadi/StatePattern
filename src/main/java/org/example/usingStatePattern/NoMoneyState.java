package org.example.usingStatePattern;

public class NoMoneyState implements VendingMachineState {
    public void insertMoney() {
        System.out.println("Money has been inserted");
    }

    public void ejectMoney() {
        System.out.println("No money to eject");
    }

    public void dispense() {
        System.out.println("Insert money first");
    }
}
