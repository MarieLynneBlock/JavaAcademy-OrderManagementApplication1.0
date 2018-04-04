package cm.marielynneblock.api.items;

import cm.marielynneblock.domain.items.Item;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ItemMapper {

    @Inject
    public ItemMapper() {
    }

    public ItemDto toDto(Item item) {
        return new ItemDto()
                .withName(item.getName())
                .withDescription(item.getDescription())
                .withPrice(item.getPrice())
                .withStockAmount(item.getStockAmount())
                .withId(item.getId());
    }

    public Item toDomain(ItemDto itemDto) {
        return new Item.ItemBuilder()
                .withName(itemDto.getName())
                .withDescription((itemDto.getDescription()))
                .withPrice(itemDto.getPrice())
                .withStockAmount((itemDto.getStockAmount()))
                .withId(itemDto.getId())
                .build();
    }

}

