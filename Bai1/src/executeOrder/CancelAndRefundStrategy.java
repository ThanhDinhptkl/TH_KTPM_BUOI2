package executeOrder;

import order.OrderStrategy;

public class CancelAndRefundStrategy implements OrderStrategy {
    public void execute() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}