package strategy;

import interfaceProduct.TaxStrategy;

public class LuxuryTaxStrategy implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.3; 
    }
}