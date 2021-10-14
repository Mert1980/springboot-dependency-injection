package com.switchfully.springdi.springbootdependencyinjection;

import com.switchfully.springdi.springbootdependencyinjection.calculations.TaxCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    private final TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxesForIncome(int yearlyIncome){
        return taxCalculation.calculateTax(yearlyIncome);
    }
}
