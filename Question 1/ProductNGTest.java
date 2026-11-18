/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.question1exam;

import static org.testng.Assert.*;

/**
 *
 * @author khumomoloantoa
 */
public class ProductNGTest {
    
    public ProductNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of GetTotalProductsSold method, of class Product.
     */
    @org.testng.annotations.Test
    public void testGetTotalProductsSold() {
        System.out.println("GetTotalProductsSold");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.GetTotalProductsSold();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAverageProductSold method, of class Product.
     */
    @org.testng.annotations.Test
    public void testGetAverageProductSold() {
        System.out.println("GetAverageProductSold");
        Product instance = new Product();
        double expResult = 0.0;
        double result = instance.GetAverageProductSold();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetMostPopularProduct method, of class Product.
     */
    @org.testng.annotations.Test
    public void testGetMostPopularProduct() {
        System.out.println("GetMostPopularProduct");
        Product instance = new Product();
        String expResult = "";
        String result = instance.GetMostPopularProduct();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
