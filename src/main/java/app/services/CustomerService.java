package app.services;

import app.models.Customer;
import app.repositories.CustomerRepository;
import app.response.RestApiException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> customerByEmail(Customer customer) {
        Optional<Customer> row = customerRepository.findCustomerByEmail(customer.getEmail());
        if (row.isPresent()) {
            return row;
        } else throw new RestApiException("Email is not found!");
    }
}