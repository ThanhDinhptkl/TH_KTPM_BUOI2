package statusOrder;

import Order.OrderState;

public class NewOrderState implements OrderState {
    public void handleOrder() {
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}
