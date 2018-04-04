package cm.marielynneblock.domain.orders;

import cm.marielynneblock.domain.items.Item;

import java.time.LocalDate;

public class ItemGroup {
    private Item item;
    private int amount;
    private LocalDate orderDate;
    private LocalDate shippingDate;

    public ItemGroup(Item item, int amount) {
        this.item = item;
        this.amount = amount;
        this.orderDate = LocalDate.now();

        if (item.getStockAmount() > this.amount) {
            this.shippingDate = orderDate.plusDays(1);
        }
        else {
            this.shippingDate = orderDate.plusDays(7);
        }
    }

    public Item getItem() {
        return this.item;
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

}
