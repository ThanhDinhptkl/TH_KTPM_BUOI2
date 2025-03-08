package productState;

import entity.Product;
import interfaceProduct.ProductState;
import strategy.VatTaxStrategy;

public class NormalProductState implements ProductState {
    public void applyTax(Product product) {
        // Sản phẩm thông thường, áp dụng thuế VAT
        product.setTaxStrategy(new VatTaxStrategy());
    }
}