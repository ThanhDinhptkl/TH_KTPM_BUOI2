package DecoratorOrder;

import Order.OrderDecorator;
import Order.OrderState;

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
