package statusOrder;

import order.OrderState;

public class CancelledOrderState implements OrderState {
    public void handleOrder() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}