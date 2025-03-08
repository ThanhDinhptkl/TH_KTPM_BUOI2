package strategy;

import interfaceProduct.TaxStrategy;

public class ExciseTaxStrategy implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.2; 
    }
}