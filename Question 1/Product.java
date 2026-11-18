/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1exam;

/**
 *
 * @author khumomoloantoa
 */
public class Product implements IProduct {
     //1D array for product names
    private String[] productNames = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket",
    
    };
    //2D arrays for sales
    private int[][] salesData = {
        {25, 18, 20},  // Cozy Nights
        {15, 10, 12},   // Restonic
        {18, 15, 20}   // Sealy
    };
       @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }
        @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int productCount = salesData.length;
        return (double) total / productCount;
    }
    
       @Override
    public String GetMostPopularProduct() {
        int highestTotal = 0;
        String mostPopular = "";
        
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            
            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                mostPopular = productNames[i] + " (" + highestTotal + ")";
            }
        }
        return mostPopular;
    }

    public String[] GetProductNames() {
        return productNames;
    }

    public int[][] GetSalesData() {
        return salesData;
    }
}



    

