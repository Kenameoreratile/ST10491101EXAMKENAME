

    

package com.mycompany.mattresssales;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500);
        double result = calc.GetVat();
        assertEquals(525.0, result, 0.01);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500);
        double result = calc.GetTotal();
        assertEquals(4200.0, result, 0.01);
    }
}