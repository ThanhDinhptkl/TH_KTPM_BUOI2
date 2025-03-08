package productState;

import entity.Product;
import interfaceProduct.ProductState;
import strategy.ExciseTaxStrategy;

public class DiscountedProductState implements ProductState {
    public void applyTax(Product product) {
        // Sản phẩm giảm giá, áp dụng thuế tiêu thụ đặc biệt
        product.setTaxStrategy(new ExciseTaxStrategy());
    }
}