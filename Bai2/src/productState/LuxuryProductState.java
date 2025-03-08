package productState;

import entity.Product;
import interfaceProduct.ProductState;
import strategy.LuxuryTaxStrategy;

public class LuxuryProductState implements ProductState {
    public void applyTax(Product product) {
        // Sản phẩm xa xỉ, áp dụng thuế đặc biệt
        product.setTaxStrategy(new LuxuryTaxStrategy());
    }
}