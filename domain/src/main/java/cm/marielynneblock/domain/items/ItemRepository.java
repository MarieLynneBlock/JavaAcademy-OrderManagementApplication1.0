package cm.marielynneblock.domain.items;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class ItemRepository {
    private List<Item> itemRepository;

    public ItemRepository() {
        this.itemRepository = new ArrayList<>();
    }

    public ItemRepository(List<Item> itemRepository) {
        this.itemRepository = itemRepository;
    }


    public List<Item> getItemRepository() {
        return itemRepository;
    }


    public void addNewItem(Item newItem) {
        itemRepository.add(newItem);
    }

}
