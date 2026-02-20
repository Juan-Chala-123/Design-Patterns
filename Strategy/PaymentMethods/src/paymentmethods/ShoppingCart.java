/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentmethods;

/**
 *
 * @author CHALA RAMIREZ
 */
public class ShoppingCart {
    private PaymentMethods paymentMethods;

    public void setPaymentMethods(PaymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
    
    public void printPayment(double amount) {
        paymentMethods.pay(amount);
    }
}
