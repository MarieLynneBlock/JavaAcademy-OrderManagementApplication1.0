package cm.marielynneblock.domain.orders;

import cm.marielynneblock.domain.customers.Customer;
import cm.marielynneblock.domain.items.Item;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private List<ItemGroup> items;
    private double totalPrice;
    private Customer customer;
    private int orderId;
    private LocalDate orderDate;

    public Order(List<ItemGroup> items, Customer customer, int orderId) {
        this.items = items;
        this.customer = customer;
        this.orderId = orderId;
        this.orderDate = LocalDate.now();
        calculateTotalPrice(items);
    }

    public List<ItemGroup> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void calculateTotalPrice(List<ItemGroup> items){
        this.totalPrice = 0.0;
        for(ItemGroup itemgroup : items){
            this.totalPrice += (itemgroup.getAmount()*itemgroup.getItem().getPrice());
        }
    }
}
