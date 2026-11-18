/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1exam;

/**
 *
 * @author khumomoloantoa
 */
class PrintProduct {
   public String PrintTotalProductSales(int total) {
        return "TOTAL PRODUCT SALES: " + total;
    }
    
    public String PrintAverageProductSales(double average) {
        return "AVERAGE PRODUCT SALES: " + String.format("%.0f", average);
    }
    
    public String PrintMostPopularProduct(String popular) {
        return "MOST POPULAR PRODUCT: " + popular;
    }
    
    
    public String PrintAllMonthlyEntries(Product product) {
        StringBuilder entries = new StringBuilder();
        String[] names = product.GetProductNames();
        int[][] data = product.GetSalesData();
        
        //Loop through each product
        for (int i = 0; i < names.length; i++) {
            for (int month = 0; month < data[i].length; month++) {
                entries.append("Enter number of sales for month ")
                       .append(month + 1)
                       .append(" for ")
                       .append(names[i])
                       .append(" mattress: ")
                       .append(data[i][month])
                       .append("\n");
            }
        }
        return entries.toString();
    }
    
    //report with entries and summary
    public void PrintFullReport(Product product) {
        System.out.println(PrintAllMonthlyEntries(product));  //All the monthly enties
        System.out.println("PRODUCT SALES REPORT - 2026"); //report heading
        System.out.println("****************************************");
        System.out.println(PrintTotalProductSales(product.GetTotalProductsSold()));
        System.out.println(PrintAverageProductSales(product.GetAverageProductSold()));
        System.out.println(PrintMostPopularProduct(product.GetMostPopularProduct()));
    }
}