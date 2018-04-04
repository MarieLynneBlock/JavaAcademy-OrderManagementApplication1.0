package cm.marielynneblock.api.orders;


import cm.marielynneblock.api.items.ItemMapper;
import cm.marielynneblock.domain.items.ItemRepository;
import cm.marielynneblock.domain.orders.ItemGroup;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ItemGroupMapper {
    private ItemMapper itemMapper;
    private ItemRepository itemRepository;

    @Inject
    public ItemGroupMapper(ItemMapper itemMapper, ItemRepository itemRepository) {
        this.itemMapper = itemMapper;
        this.itemRepository = itemRepository;
    }

    public ItemGroupDto toDto(ItemGroup itemGroup) {
        return new ItemGroupDto()
                .withItem(itemGroup.getItem())
                .withAmount(itemGroup.getAmount())
                .withOrderDate(itemGroup.getShippingDate());
    }

    public ItemGroup toDomain(ItemGroupDto itemGroupDto) {
        return new ItemGroup(itemGroupDto.getItem(), itemGroupDto.getAmount());
    }
}
