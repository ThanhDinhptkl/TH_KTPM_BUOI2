package decoratorOrder;

import order.OrderDecorator;
import order.OrderState;

public class LoggingDecorator extends OrderDecorator {
    public LoggingDecorator(OrderState decoratedOrder) {
        super(decoratedOrder);
    }

    public void handleOrder() {
        super.handleOrder();
        logOrderAction();
    }

    private void logOrderAction() {
        System.out.println("Đã ghi log hành động cho đơn hàng.");
    }
}