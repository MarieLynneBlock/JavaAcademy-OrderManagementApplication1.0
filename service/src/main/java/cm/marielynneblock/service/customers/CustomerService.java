package cm.marielynneblock.service.customers;

import cm.marielynneblock.domain.customers.Customer;
import cm.marielynneblock.domain.customers.CustomerRepository;

import java.util.ArrayList;
import java.util.List;


public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addNewCustomer(Customer newCustomer) {
        customerRepository.addNewCustomer(newCustomer);
        return newCustomer;
    }

    public List<Customer> displayAllCustomers() {
        return new ArrayList<>(customerRepository.displayAllCustomers());
    }

}
