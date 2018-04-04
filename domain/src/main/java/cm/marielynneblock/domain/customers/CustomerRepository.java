package cm.marielynneblock.domain.customers;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Named
public class CustomerRepository {
    private List<Customer> customerRepository;

    public CustomerRepository() {
        this.customerRepository = new ArrayList<>();
    }

    public CustomerRepository(List<Customer> customersRepository) {
        this.customerRepository = customersRepository;
    }


    public List<Customer> getCustomersRepository() {
        return customerRepository;
    }


    public void addNewCustomer(Customer newCustomer) {
        customerRepository.add(newCustomer);
    }


    public List<Customer> displayAllCustomers() {
        return customerRepository;
    }

}
