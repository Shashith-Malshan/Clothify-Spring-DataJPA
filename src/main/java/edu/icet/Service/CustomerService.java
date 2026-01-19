package edu.icet.Service;

import edu.icet.Repository.CustomerRepository;
import edu.icet.model.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void save(CustomerDto customerDto) {
        customerRepository.save(customerDto);
    }

    public List<CustomerDto> findAll() {
        return customerRepository.findAll();
    }

    public Optional<CustomerDto> findById(String id) {
        return customerRepository.findById(id);
    }

    public void deleteById(String id) {
        customerRepository.deleteById(id);

    }

    public void update(String id, CustomerDto customerDto) {
        String name=customerDto.getName();
        String address=customerDto.getAddress();
        String phone=customerDto.getPhone();
        customerRepository.update(id,name,address,phone);
    }
}
