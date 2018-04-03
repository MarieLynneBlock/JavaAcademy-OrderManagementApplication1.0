package cm.marielynneblock.service.customers;

import cm.marielynneblock.domain.customers.Customer;
import cm.marielynneblock.domain.customers.CustomerRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerServiceTest {
    CustomerService testCustomerService;
    CustomerRepository testCustomerRepository;

    List<Customer> testList = new ArrayList<>();

    Customer customer1 = new Customer.CustomerBuilder()
            .withFirstName("Jan")
            .withLastName("Peeters")
            .withEmail("jan-peeters@email.be")
            .withAddress("Stationstraat 10")
            .withPhoneNumber("123456789")
            .build();

    Customer customer2 = new Customer.CustomerBuilder()
            .withFirstName("Piet")
            .withLastName("Janssens")
            .withEmail("janssens@email.be")
            .withAddress("Stationstraat 11")
            .withPhoneNumber("98765432")
            .build();

    @Before
    public void setup() {
        testList.add(customer1);

        testCustomerRepository = new CustomerRepository(testList);

        testCustomerService = new CustomerService(testCustomerRepository);
    }


    @Test
    public void addNewCustomer_whenCustomerIsAdded_repositoryContainsNewCustomer() {
        testCustomerRepository.addNewCustomer(customer2);

        List<Customer> testContainsAll = new ArrayList();
            testContainsAll.add(customer1);
            testContainsAll.add(customer2);

        assertEquals(testCustomerRepository.getCustomersRepository(), testContainsAll);
    }

}