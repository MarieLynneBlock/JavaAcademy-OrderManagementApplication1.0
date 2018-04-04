package cm.marielynneblock.domain.items;

import javax.inject.Named;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
public class ItemRepository {
    private Map<Integer, Item> itemRepository;
    int itemId;

    public ItemRepository() {
        this.itemRepository = new HashMap<>();
        this.itemId = 1;
    }

    public ItemRepository(Map<Integer, Item> itemRepository) {
        this.itemRepository = itemRepository;
    }


    public Map<Integer, Item> getItemRepository() {
        return itemRepository;
    }


    public void addNewItem(Item newItem) {
        itemRepository.put(newItem.getId(), newItem);
        itemId++;
    }

    public void updateItem(Item updatedItem) {
        itemRepository.put(updatedItem.getId(), updatedItem);
    }

}
