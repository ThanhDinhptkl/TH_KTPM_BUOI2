package statusOrder;

import order.OrderState;

public class ProcessingOrderState implements OrderState {
    public void handleOrder() {
        System.out.println("Đóng gói và vận chuyển.");
    }
}