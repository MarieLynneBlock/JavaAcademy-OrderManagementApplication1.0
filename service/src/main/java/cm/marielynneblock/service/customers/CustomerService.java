package cm.marielynneblock.service.customers;

import cm.marielynneblock.domain.customers.Customer;
import cm.marielynneblock.domain.customers.CustomerRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class CustomerService {
    private CustomerRepository customerRepository;

    @Inject
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
