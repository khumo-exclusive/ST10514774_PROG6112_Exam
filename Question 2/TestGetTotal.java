/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author khumomoloantoa
 */
public class TestGetTotal {
    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        // Arrange: Price = 3500, VAT = 525, Commission = 175, Total = 4200
        double price = 3500;
        ProductCalculations calc = new ProductCalculations(price);
        
        // Act
        double expected = 4200.0;
        double actual = calc.GetTotal();
        
        // Assert
        assertEquals(expected, actual, 0.01);
    }
}
   