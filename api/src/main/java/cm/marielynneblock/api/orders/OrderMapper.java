package cm.marielynneblock.api.orders;

import cm.marielynneblock.domain.items.Item;
import cm.marielynneblock.domain.orders.ItemGroup;
import cm.marielynneblock.domain.orders.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.stream.Collectors;

@Named
public class OrderMapper {
    private ItemGroupMapper itemGroupMapper;



    @Inject
    public OrderMapper(ItemGroupMapper itemGroupMapper) {
        this.itemGroupMapper = itemGroupMapper;

    }

    public OrderDto toDto(Order order){
        List<ItemGroupDto> itemGroupDtos = order.getItems().stream()
                .map(itemGroup -> itemGroupMapper.toDto(itemGroup))
                .collect(Collectors.toList());

        return new OrderDto()
                .withCustomer(order.getCustomer())
                .withOrderId(order.getOrderId())
                .withTotalPrice(order.getTotalPrice())
                .withItems(itemGroupDtos);

    }
    public Order toDomain(OrderDto orderDto) {
        List<ItemGroup> itemGroups = orderDto.getItemsDto().stream()
                .map(itemGroupDto -> itemGroupMapper.toDomain(itemGroupDto))
                .collect(Collectors.toList());
        return new Order(itemGroups,orderDto.getCustomer());
    }

}
