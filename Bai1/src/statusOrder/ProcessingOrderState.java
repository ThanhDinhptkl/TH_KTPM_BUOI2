package statusOrder;

import Order.OrderState;

public class ProcessingOrderState implements OrderState {
    public void handleOrder() {
        System.out.println("Đóng gói và vận chuyển.");
    }
}