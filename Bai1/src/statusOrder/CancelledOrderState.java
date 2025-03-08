package statusOrder;

import Order.OrderState;

public class CancelledOrderState implements OrderState {
    public void handleOrder() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}