package edu.icet.Service;

import edu.icet.Repository.CustomerRepository;
import edu.icet.model.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void save(CustomerDto customerDto) {
        customerRepository.save(customerDto);
    }
}
