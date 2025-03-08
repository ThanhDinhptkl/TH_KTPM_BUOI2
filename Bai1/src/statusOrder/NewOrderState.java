package statusOrder;

import order.OrderState;

public class NewOrderState implements OrderState {
    public void handleOrder() {
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}
