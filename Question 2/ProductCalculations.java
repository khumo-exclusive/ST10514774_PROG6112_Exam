/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khumomoloantoa
 */
class ProductCalculations {
     // Store the base product price
    private double productPrice;
    
   
    public ProductCalculations(double price) {
        this.productPrice = price;
    }
    
    public double GetVat() {
        // VAT is 15% of the product price
        return productPrice * 0.15;
    }
    
    public double GetCommission() {
        // Commission is 5% of the product price
        return productPrice * 0.05;
    }
    
    public double GetTotal() {
        // Total = Price + VAT + Commission
        return productPrice + GetVat() + GetCommission();
    }
}



