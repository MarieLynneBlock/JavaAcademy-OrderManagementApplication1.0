package cm.marielynneblock.domain.customers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerRepositoryTest {
    private CustomerRepository testEmptyCustomerRepo;
    private CustomerRepository testPopulatedCustomerRepo;

    private List<Customer> customerList = new ArrayList<>();
    private Customer customer1, customer2, customer3, customer4;


    @Before
    public void setup() {
        testEmptyCustomerRepo = new CustomerRepository();
        testPopulatedCustomerRepo = new CustomerRepository(customerList);


        // customers
        customer1 = new Customer.CustomerBuilder()
                .withFirstName("Jan")
                .withLastName("Peeters")
                .withEmail("jan-peeters@email.be")
                .withAddress("Stationstraat 10")
                .withPhoneNumber("123456789")
                .build();

        customer2 = new Customer.CustomerBuilder()
                .withFirstName("Piet")
                .withLastName("Janssens")
                .withEmail("janssens@email.be")
                .withAddress("Stationstraat 11")
                .withPhoneNumber("98765432")
                .build();

        customer3 = new Customer.CustomerBuilder()
                .withFirstName("Joris")
                .withLastName("Pieters")
                .withEmail("j.pieters@email.be")
                .withAddress("Stationstraat 12")
                .withPhoneNumber("13243546")
                .build();

        customer4 = new Customer.CustomerBuilder()
                .withFirstName("Corneel")
                .withLastName("Jorissen")
                .withEmail("Corneeltje@email.be")
                .withAddress("Stationstraat 13")
                .withPhoneNumber("64534231")
                .build();

        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
    }


    @Test
    public void addNewCustomer_whenNewCustomerIsAddedInEmptyList_returnNotANewCustomerList() {
        testEmptyCustomerRepo.addNewCustomer(customer1);

        assertNotEquals(new CustomerRepository(), testEmptyCustomerRepo);
    }


    @Test
    public void addNewCustomer_whenNewCustomerIsAddedInEmptyList_returnNotAnEmptyList() {
        testEmptyCustomerRepo.addNewCustomer(customer1);

        assertNotNull(testEmptyCustomerRepo);
    }


    @Test
    public void addNewCustomer_whenNewCustomerIsAddedToPopulatedList_addsToList() {
        List<Customer> testContainsAllCustomers = new ArrayList<>();
        testContainsAllCustomers.add(customer2);
        testContainsAllCustomers.add(customer3);
        testContainsAllCustomers.add(customer4);
        testContainsAllCustomers.add(customer1);

        testPopulatedCustomerRepo.addNewCustomer(customer1);

        assertEquals(testPopulatedCustomerRepo.getCustomersRepository(), testContainsAllCustomers);
    }

}