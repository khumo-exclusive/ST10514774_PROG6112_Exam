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
public class TestGetVat {
        @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        // Arrange: Price = 3500, expected VAT = 3500 × 0.15 = 525
        double price = 3500;
        ProductCalculations calc = new ProductCalculations(price);
        
        // Act
        double expected = 525.0;
        double actual = calc.GetVat();
        
        // Assert
        assertEquals(expected, actual, 0.01);
    }
}
    