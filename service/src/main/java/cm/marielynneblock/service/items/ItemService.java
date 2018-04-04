package cm.marielynneblock.service.items;

import cm.marielynneblock.domain.items.Item;
import cm.marielynneblock.domain.items.ItemRepository;

public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addNewItem(Item newItem) {
        itemRepository.addNewItem(newItem);
        return newItem;
    }

}
