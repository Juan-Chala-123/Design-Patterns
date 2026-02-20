/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paymentmethods;

import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        
        System.out.println("Tarjeta: ");
        String t = sc.nextLine();
        PaymentMethods tarjeta = new CardPayment(t);
        cart.setPaymentMethods(tarjeta);
        cart.printPayment(100);
    }
    
}
