package com.switchfully.springdi.springbootdependencyinjection;

import com.switchfully.springdi.springbootdependencyinjection.calculations.TaxCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDependencyInjectionApplication implements CommandLineRunner {

    private final ApplicationContext ctx;

    @Autowired
    public SpringbootDependencyInjectionApplication(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDependencyInjectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TaxCalculator taxCalculator = ctx.getBean(TaxCalculator.class);
        double taxesToPay = taxCalculator.calculateTaxesForIncome(23000);
        System.out.println(taxesToPay);
    }
}
