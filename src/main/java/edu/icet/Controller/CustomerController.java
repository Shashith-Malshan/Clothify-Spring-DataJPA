package edu.icet.Controller;

import edu.icet.Service.CustomerService;
import edu.icet.model.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customerInfo")

public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public String save(@RequestBody CustomerDto customerDto){
        customerService.save(customerDto);
        return "Customer added successfully";
    }

    @GetMapping
    public List<CustomerDto> findAll(){
        return customerService.findAll();
    }

    @GetMapping("{id}")
    public CustomerDto findById(@PathVariable String id){
        return customerService.findById(id);
    }

}
