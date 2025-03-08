package decorator;

import interfaceProduct.TaxStrategy;

public class DiscountTaxDecorator extends TaxDecorator {
    public DiscountTaxDecorator(TaxStrategy decoratedTaxStrategy) {
        super(decoratedTaxStrategy);
    }

    @Override
    public double calculateTax(double price) {
        double tax = super.calculateTax(price);
        System.out.println("Áp dụng giảm giá cho thuế.");
        return tax - (tax * 0.05); // Giảm 5% thuế
    }
}
