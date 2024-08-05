package com.aurionpro.dipviolation.model;

import com.aurionpro.dipviolation.model.ILogger;

public class TaxCalculator {
    private ILogger logger;

    public TaxCalculator(ILogger logger) {
        super();
        this.logger = logger;
    }

    public ILogger getLogger() {
        return logger;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public int calculateTax(int amount, int rate) {
        int tax = 0;
        try {
            tax = amount / rate;
            System.out.println("Calculated Tax: " + tax);
        } catch (Exception e) {
            // Use the logger instance to log the exception message
            logger.log("Divide by zero");
        }
        return tax;
    }
}
