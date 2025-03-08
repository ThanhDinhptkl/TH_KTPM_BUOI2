package executeOrder;

import order.OrderStrategy;

public class CheckOrderInfoStrategy implements OrderStrategy {
    public void execute() {
        System.out.println("Đang kiểm tra thông tin đơn hàng.");
    }
}