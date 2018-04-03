package cm.marielynneblock.api.customers;

import cm.marielynneblock.domain.customers.Customer;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CustomerMapper {

    @Inject
    public CustomerMapper() {
    }

    public CustomerDto toDto(Customer customer) {
        return new CustomerDto()
                .withFirstName(customer.getFirstName())
                .withLastName(customer.getLastName())
                .withEmail(customer.getEmail())
                .withAddress(customer.getAddress())
                .withPhoneNumber(customer.getPhoneNumber());
    }

    public Customer toDomain(CustomerDto customerDto) {
        return new Customer.CustomerBuilder()
                .withFirstName(customerDto.getFirstName())
                .withLastName(customerDto.getLastName())
                .withEmail(customerDto.getEmail())
                .withAddress(customerDto.getAddress())
                .withPhoneNumber(customerDto.getPhoneNumber())
                .build();
    }

}
