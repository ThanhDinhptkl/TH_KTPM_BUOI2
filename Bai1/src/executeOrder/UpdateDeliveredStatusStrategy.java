package executeOrder;

import order.OrderStrategy;

public class UpdateDeliveredStatusStrategy implements OrderStrategy {
    public void execute() {
        System.out.println("Cập nhật trạng thái là đã giao.");
    }
}
