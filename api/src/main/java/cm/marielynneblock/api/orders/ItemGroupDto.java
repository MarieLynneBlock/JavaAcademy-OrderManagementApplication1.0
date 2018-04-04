package cm.marielynneblock.api.orders;

import cm.marielynneblock.domain.items.Item;
import cm.marielynneblock.domain.orders.ItemGroup;

import java.time.LocalDate;

public class ItemGroupDto {
    private Item item;
    private int amount;
    private LocalDate orderDate;
    private LocalDate shippingDate;

    public ItemGroupDto() {
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
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

}
