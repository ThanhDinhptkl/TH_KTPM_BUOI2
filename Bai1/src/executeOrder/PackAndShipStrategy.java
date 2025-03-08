package executeOrder;

import Order.OrderStrategy;

public class PackAndShipStrategy implements OrderStrategy {
    public void execute() {
        System.out.println("Đang đóng gói và vận chuyển.");
    }
}