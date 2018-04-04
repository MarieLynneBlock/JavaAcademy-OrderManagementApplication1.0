package cm.marielynneblock.domain.orders;

import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named
public class OrderRepository {
    private Map<Integer, Order> orderRepository;


    public OrderRepository(){
        this.orderRepository = new HashMap<>();
    }

    public OrderRepository(Map<Integer, Order> orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Map<Integer, Order> getOrderRepository() {
        return orderRepository;
    }
    public void addNewOrder(Order newOrder) {
        orderRepository.put(newOrder.getOrderId(), newOrder);
    }
}
