package cm.marielynneblock.api.orders;

import cm.marielynneblock.api.customers.CustomerDto;
import cm.marielynneblock.domain.customers.Customer;
import cm.marielynneblock.domain.orders.ItemGroup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    private ArrayList<ItemGroupDto> items;
    private double totalPrice;
    private Customer customer;
    private int orderId;
    private LocalDate orderDate;
    private CustomerDto customerDto;


    public OrderDto OrderDto() {
        return new OrderDto();
    }

    public OrderDto withItems(List<ItemGroupDto> itemGroups) {
        this.items = new ArrayList<>(itemGroups);
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

    public List<ItemGroupDto> getItemsDto() {
        return items;
    }
    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public Customer getCustomer() {
        return customer;
    }
}
