package cm.marielynneblock.domain.items;

import cm.marielynneblock.domain.customers.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ItemRepositoryTest {
    private ItemRepository testEmptyItemRepo;
    private ItemRepository testPopulatedItemRepo;

    private List<Item> itemList = new ArrayList<>();
    private Item item1, item2, item3, item4;

    @Before
    public void setup() {
        testEmptyItemRepo = new ItemRepository();
        testPopulatedItemRepo = new ItemRepository(itemList);


        // items
        item1 = new Item.ItemBuilder()
                .withName("Item 1")
                .withDescription("Item 1")
                .withPrice(1.1)
                .withStockAmount(1)
                .build();

        item2 = new Item.ItemBuilder()
                .withName("Item 2")
                .withDescription("Item 2")
                .withPrice(2.2)
                .withStockAmount(2)
                .build();

        item3 = new Item.ItemBuilder()
                .withName("Item 3")
                .withDescription("Item 3")
                .withPrice(3.3)
                .withStockAmount(3)
                .build();

        item4 = new Item.ItemBuilder()
                .withName("Item 4")
                .withDescription("Item 4")
                .withPrice(4.4)
                .withStockAmount(4)
                .build();

        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
    }


    @Test
    public void addNewItem_whenNewItemIsAddedInEmptyList_returnNotANewCustomerList() {
        testEmptyItemRepo.addNewItem(item1);

        assertNotEquals(new ItemRepository(), testEmptyItemRepo);
    }

    @Test
    public void addNewItem_whenNewItemIsAddedInEmptyList_returnNotAnEmptyList() {
        testEmptyItemRepo.addNewItem(item1);

        assertNotNull(testEmptyItemRepo);
    }

    @Test
    public void addNewItem_whenNewItemIsAddedToPopulatedList_addsToList() {
        List<Item> testContainsAllItems = new ArrayList<>();
        testContainsAllItems.add(item2);
        testContainsAllItems.add(item3);
        testContainsAllItems.add(item4);
        testContainsAllItems.add(item1);

        testPopulatedItemRepo.addNewItem(item1);

        assertEquals(testPopulatedItemRepo.getItemRepository(), testContainsAllItems);
    }

}