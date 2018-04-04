package cm.marielynneblock.api.orders;

import cm.marielynneblock.domain.customers.Customer;
import cm.marielynneblock.domain.orders.ItemGroup;

import java.time.LocalDate;
import java.util.List;

public class OrderDto {
    private List<ItemGroup> items;
    private double totalPrice;
    private Customer customer;
    private int orderId;
    private LocalDate orderDate;

    public OrderDto() {
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

    public OrderDto withItems(List<ItemGroup> items) {
        this.items = items;
        return this;
    }

    public OrderDto withTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public OrderDto withCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderDto withOrderId(int orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderDto withOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
        return this;
    }

}
