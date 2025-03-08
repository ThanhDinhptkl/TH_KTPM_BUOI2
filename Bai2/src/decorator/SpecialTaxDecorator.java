package decorator;

import interfaceProduct.TaxStrategy;

public class SpecialTaxDecorator extends TaxDecorator {
	public SpecialTaxDecorator(TaxStrategy decoratedTaxStrategy) {
        super(decoratedTaxStrategy);
    }

    @Override
    public double calculateTax(double price) {
        double tax = super.calculateTax(price);
        System.out.println("Áp dụng thuế đặc biệt cho sản phẩm.");
        return tax + 10; // Thêm 10 vào thuế
    }
}