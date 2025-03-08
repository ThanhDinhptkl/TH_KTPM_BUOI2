package entity;

import interfaceProduct.ProductState;
import interfaceProduct.TaxStrategy;

public class Product {
	private String name;
	private double price;
	private TaxStrategy taxStrategy;
	private ProductState productState;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setTaxStrategy(TaxStrategy taxStrategy) {
		this.taxStrategy = taxStrategy;
	}

	public void setProductState(ProductState productState) {
		this.productState = productState;
	}

	public double calculateTax() {
		return taxStrategy.calculateTax(price);
	}

	public double calculateFinalPrice() {
		return price + calculateTax();
	}

	public void applyTaxStrategy() {
		productState.applyTax(this);
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
