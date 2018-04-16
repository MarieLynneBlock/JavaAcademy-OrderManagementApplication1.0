package cm.marielynneblock.api.orders;

import cm.marielynneblock.service.orders.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
    private OrderService orderService;
    private OrderMapper orderMapper;
    private ItemGroupMapper itemGroupMapper;

    @Inject
    public OrderController(OrderService orderService, OrderMapper orderMapper, ItemGroupMapper itemGroupMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
        this.itemGroupMapper = itemGroupMapper;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDto addNewOrder(@RequestBody OrderDto newOrder) {
        return orderMapper.toDto(orderService.addNewOrder(orderMapper.toDomain(newOrder)));
    }

}
