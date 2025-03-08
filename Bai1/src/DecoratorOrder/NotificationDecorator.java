package decoratorOrder;

import order.OrderDecorator;
import order.OrderState;

public class NotificationDecorator extends OrderDecorator {
    public NotificationDecorator(OrderState decoratedOrder) {
        super(decoratedOrder);
    }

    public void handleOrder() {
        super.handleOrder();
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Gửi thông báo đến khách hàng.");
    }
}
