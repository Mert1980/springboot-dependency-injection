package com.switchfully.springdi.springbootdependencyinjection.calculations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("belgium")
@Component
public class BelgiumTaxCalculation implements TaxCalculation {
    @Override
    public double calculateTax(int yearlyIncome) {
        return yearlyIncome * 0.45;
    }
}
