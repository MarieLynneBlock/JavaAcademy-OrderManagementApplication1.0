package cm.marielynneblock.api.items;

import cm.marielynneblock.domain.items.Item;

public class ItemDto {
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    private int id;

    public ItemDto() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public int getId() {
        return id;
    }

    public ItemDto withName(String name) {
        this.name = name;
        return this;
    }

    public ItemDto withDescription(String description) {
        this.description = description;
        return this;
    }

    public ItemDto withPrice(double price) {
        this.price = price;
        return this;
    }

    public ItemDto withStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
        return this;
    }

    public ItemDto withId(int id) {
        this.id = id;
        return this;
    }

}
