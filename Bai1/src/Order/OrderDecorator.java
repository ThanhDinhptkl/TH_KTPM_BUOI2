package order;

public abstract class OrderDecorator implements OrderState {
    protected OrderState decoratedOrder;

    public OrderDecorator(OrderState decoratedOrder) {
        this.decoratedOrder = decoratedOrder;
    }

    public void handleOrder() {
        decoratedOrder.handleOrder();
    }
}
