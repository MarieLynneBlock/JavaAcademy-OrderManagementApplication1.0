package cm.marielynneblock.domain.items;

import cm.marielynneblock.domain.customers.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ItemRepositoryTest {
    private ItemRepository testEmptyItemRepo;
    private ItemRepository testPopulatedItemRepo;

    private Map<Integer, Item> itemList = new HashMap<>();
    private Item item1, item2, item3, item4, item5;

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
                .withId(1)
                .build();

        item2 = new Item.ItemBuilder()
                .withName("Item 2")
                .withDescription("Item 2")
                .withPrice(2.2)
                .withStockAmount(2)
                .withId(2)
                .build();

        item3 = new Item.ItemBuilder()
                .withName("Item 3")
                .withDescription("Item 3")
                .withPrice(3.3)
                .withStockAmount(3)
                .withId(3)
                .build();

        item4 = new Item.ItemBuilder()
                .withName("Item 4")
                .withDescription("Item 4")
                .withPrice(4.4)
                .withStockAmount(4)
                .withId(4)
                .build();

        itemList.put(item2.getId(), item2);
        itemList.put(item3.getId(), item3);
        itemList.put(item4.getId(), item4);
    }


    @Test
    public void addNewItem_whenNewItemIsAddedInEmptyMap_returnNotANewCustomerMap() {
        testEmptyItemRepo.addNewItem(item1);

        assertNotEquals(new ItemRepository(), testEmptyItemRepo);
    }

    @Test
    public void addNewItem_whenNewItemIsAddedInEmptyMap_returnNotAnEmptyMap() {
        testEmptyItemRepo.addNewItem(item1);

        assertNotNull(testEmptyItemRepo);
    }

    @Test
    public void addNewItem_whenNewItemIsAddedToPopulatedList_addsToList() {
        Map<Integer, Item> testContainsAllItems = new HashMap<>();
        testContainsAllItems.put(item2.getId(), item2);
        testContainsAllItems.put(item3.getId(), item3);
        testContainsAllItems.put(item4.getId(), item4);
        testContainsAllItems.put(item1.getId(), item1);

        testPopulatedItemRepo.addNewItem(item1);

        assertEquals(testPopulatedItemRepo.getItemRepository(), testContainsAllItems);
    }

    @Test
    public void test_printMapKeys() {
        testPopulatedItemRepo.addNewItem(item1);

        Set<Integer> keys = testPopulatedItemRepo.getItemRepository().keySet();
        for(Integer key : keys){
            System.out.println(key);
        }
    }

    @Test
    public void updateItem_whenItemIsUpdated_returnNewInformationReplacingTheOldItemInformation() {
        item5 = new Item.ItemBuilder()
                .withName("Item 5")
                .withDescription("Item 5")
                .withPrice(5.5)
                .withStockAmount(5)
                .withId(4)  // update item4
                .build();

        // System.out.println(testPopulatedItemRepo.getItemRepository().get(4).getName());
        testPopulatedItemRepo.updateItem(item5);

        // System.out.println(testPopulatedItemRepo.getItemRepository().get(4).getName());
        assertEquals(testPopulatedItemRepo.getItemRepository().get(4).getName(), item5.getName());
    }

}