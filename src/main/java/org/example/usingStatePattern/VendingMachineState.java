package org.example.usingStatePattern;

public interface VendingMachineState {
    //This method is called when money is inserted into the vending machine
    void insertMoney();

    //This method is called when the customer decides to cancel the transaction and wants to receive their money back
    void ejectMoney();

    // This method is called when the customer has inserted enough money and selected a product, and the vending machine is ready to dispense the product.
    void dispense();
}
