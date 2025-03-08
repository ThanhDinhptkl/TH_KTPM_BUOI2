package decorator;

import interfaceProduct.TaxStrategy;

public abstract class TaxDecorator implements TaxStrategy {
	protected TaxStrategy decoratedTaxStrategy;

	public TaxDecorator(TaxStrategy decoratedTaxStrategy) {
		this.decoratedTaxStrategy = decoratedTaxStrategy;
	}

	public double calculateTax(double price) {
		return decoratedTaxStrategy.calculateTax(price);
	}
}
