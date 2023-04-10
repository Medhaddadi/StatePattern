package org.example.usingStatePattern;

public class DispenseState implements VendingMachineState {
    public void insertMoney() {
        System.out.println("Please wait, product already dispensed");
    }

    public void ejectMoney() {
        System.out.println("Sorry, you already received your product");
    }

    public void dispense() {
        System.out.println("No product dispensed");
    }
}
