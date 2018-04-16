package cm.marielynneblock.api.customers;

import cm.marielynneblock.service.customers.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = {"/customers"})
public class CustomerController {
    private CustomerService customerService;
    private CustomerMapper customerMapper;

    @Inject
    public CustomerController(CustomerService customerService, CustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerMapper = customerMapper;
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto addNewCustomer(@RequestBody CustomerDto customerDto) {
        return customerMapper.toDto(
                customerService.addNewCustomer(
                        customerMapper.toDomain(customerDto)));
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerDto> displayAllCustomers() {
        return customerService.displayAllCustomers().stream()
                .map(customerMapper::toDto)
                .collect(Collectors.toList());
    }

}
