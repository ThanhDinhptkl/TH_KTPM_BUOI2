package statusOrder;

import Order.OrderState;

public class ShippedOrderState implements OrderState {
    public void handleOrder() {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
