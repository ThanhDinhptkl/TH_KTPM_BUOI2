package order;
// Class quản lý trạng thái của Order
public class OrderContext {
    private OrderState currentState;

    public OrderContext(OrderState initialState) {
        this.currentState = initialState;
    }

    public void setCurrentState(OrderState state) {
        this.currentState = state;
    }

    public void executeStateAction() {
        currentState.handleOrder();
    }
}

