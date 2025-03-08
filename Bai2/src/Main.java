import decorator.DiscountTaxDecorator;
import entity.Product;
import productState.DiscountedProductState;
import productState.LuxuryProductState;
import productState.NormalProductState;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Sản phẩm thông thường", 100);
        product1.setProductState(new NormalProductState());
        product1.applyTaxStrategy();
        System.out.println("Giá cuối cùng (sản phẩm thông thường): " + product1.calculateFinalPrice());

        Product product2 = new Product("Sản phẩm xa xỉ", 200);
        product2.setProductState(new LuxuryProductState());
        product2.applyTaxStrategy();
        System.out.println("Giá cuối cùng (sản phẩm xa xỉ): " + product2.calculateFinalPrice());

        Product product3 = new Product("Sản phẩm giảm giá", 50);
        product3.setProductState(new DiscountedProductState());
        product3.applyTaxStrategy();
        System.out.println("Giá cuối cùng (sản phẩm giảm giá): " + product3.calculateFinalPrice());

    }
}
