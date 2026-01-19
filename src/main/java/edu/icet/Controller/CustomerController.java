package edu.icet.Controller;

import edu.icet.Service.CustomerService;
import edu.icet.model.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
