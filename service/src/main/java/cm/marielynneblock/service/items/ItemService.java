package cm.marielynneblock.service.items;

import cm.marielynneblock.domain.items.Item;
import cm.marielynneblock.domain.items.ItemRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named
public class ItemService {
    private ItemRepository itemRepository;

    @Inject
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addNewItem(Item newItem) {
        itemRepository.addNewItem(newItem);
        return newItem;
    }

    public Item updateItem(Item updatedItem) {
        itemRepository.updateItem(updatedItem);
        return updatedItem;
    }

}
