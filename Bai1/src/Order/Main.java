package order;

import decoratorOrder.LoggingDecorator;
import decoratorOrder.NotificationDecorator;
import statusOrder.NewOrderState;
import statusOrder.ProcessingOrderState;
import statusOrder.ShippedOrderState;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đơn hàng với trạng thái mới tạo
        OrderContext order = new OrderContext(new NewOrderState());
        order.executeStateAction(); 

        // Chuyển trạng thái thành Đang xử lý và thực thi hành vi
        order.setCurrentState(new ProcessingOrderState());
        order.executeStateAction(); 

        // Sử dụng Decorator để thêm thông báo và log
        OrderState decoratedOrder = new LoggingDecorator(new NotificationDecorator(new ShippedOrderState()));
        order.setCurrentState(decoratedOrder);
        order.executeStateAction();
    }
}
