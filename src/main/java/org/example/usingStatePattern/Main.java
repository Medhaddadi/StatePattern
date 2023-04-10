package org.example.usingStatePattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        // No money inserted
        System.out.println("*************** No money inserted ***************");
        vendingMachine.insertMoney();
        vendingMachine.ejectMoney();
        vendingMachine.dispense();

        // Money inserted
        System.out.println("*************** Money inserted ***************");
        vendingMachine.insertMoney();
        vendingMachine.insertMoney();
        vendingMachine.ejectMoney();
        vendingMachine.dispense();

        // Money inserted
        // Product dispensed
        System.out.println("*************** Money inserted ***************");
        System.out.println("*************** Product dispensed ***************");
        vendingMachine.insertMoney();
        vendingMachine.dispense();
        vendingMachine.ejectMoney();
    }
}