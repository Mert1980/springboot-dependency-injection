package com.switchfully.springdi.springbootdependencyinjection.calculations;

import org.springframework.stereotype.Service;

@Service
public interface TaxCalculation {

    double calculateTax(int yearlyIncome);
}
