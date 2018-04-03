package cm.marielynneblock.service.customers;

import cm.marielynneblock.domain.customers.Customer;
import cm.marielynneblock.domain.customers.CustomerRepository;


public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addNewCustomer(Customer newCustomer) {
        customerRepository.addNewCustomer(newCustomer);
        return newCustomer;
    }

}
