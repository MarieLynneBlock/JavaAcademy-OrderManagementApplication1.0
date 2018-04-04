package cm.marielynneblock.domain.items;

public class Item {
    private final String name;
    private final String description;
    private final double price;
    private final int stockAmount;

    private Item(ItemBuilder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.stockAmount = builder.stockAmount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stockAmount=" + stockAmount +
                '}';
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

    public static class ItemBuilder {
        private String name;
        private String description;
        private double price;
        private int stockAmount;


        public ItemBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ItemBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ItemBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ItemBuilder withStockAmount(int stockAmount) {
            this.stockAmount = stockAmount;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }

}