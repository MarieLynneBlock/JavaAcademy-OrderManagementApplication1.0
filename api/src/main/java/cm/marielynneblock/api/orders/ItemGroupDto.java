package cm.marielynneblock.api.orders;

import cm.marielynneblock.domain.items.Item;
import cm.marielynneblock.domain.orders.ItemGroup;

import java.time.LocalDate;

public class ItemGroupDto {
    private Item item;
    private int amount;
    private LocalDate orderDate;
    private LocalDate shippingDate;

    public ItemGroupDto ItemGroupDto() {
        return new ItemGroupDto();
    }
    public ItemGroupDto withItem(Item item) {
        this.item = item;
        return this;
    }

    public ItemGroupDto withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public ItemGroupDto withOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public ItemGroupDto withShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Item getItem() {
        return item;
    }
}
