/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentmethods;

/**
 *
 * @author CHALA RAMIREZ
 */
public class PayPalPayment implements PaymentMethods {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Responsable: " + this.email);
        System.out.println("Total a apgar: " + amount);
    }
    
}
