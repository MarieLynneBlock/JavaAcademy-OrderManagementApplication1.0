package cm.marielynneblock.domain.items;

public class Item {
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    private int id;


    private Item(ItemBuilder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.stockAmount = builder.stockAmount;
        this.id = builder.id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stockAmount=" + stockAmount +
                ", id=" + id +
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

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public static class ItemBuilder {
        private String name;
        private String description;
        private double price;
        private int stockAmount;

        private int id;


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

        public ItemBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }

}