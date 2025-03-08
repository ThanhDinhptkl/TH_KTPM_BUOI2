package strategy;

import interfaceProduct.TaxStrategy;

public class VatTaxStrategy implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.1;
    }
}