package com.aurionpro.dipviolation.test;

import com.aurionpro.dipviolation.model.DbLogger;
import com.aurionpro.dipviolation.model.FileLogger;
import com.aurionpro.dipviolation.model.TaxCalculator;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        // Test with DbLogger
        TaxCalculator calculatorWithDbLogger = new TaxCalculator(new DbLogger());
        calculatorWithDbLogger.calculateTax(100, 0);

        // Test with FileLogger
        TaxCalculator calculatorWithFileLogger = new TaxCalculator(new FileLogger());
        calculatorWithFileLogger.calculateTax(100, 5);
    }
}