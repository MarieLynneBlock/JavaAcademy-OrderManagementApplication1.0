package cm.marielynneblock.service.orders;


import cm.marielynneblock.domain.orders.Order;
import cm.marielynneblock.domain.orders.OrderRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class OrderService {
    private OrderService orderRepository;

    @Inject
    public OrderService(OrderService orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addNewOrder(Order newOrder) {
        orderRepository.addNewOrder((newOrder));
        return newOrder;
    }

}
