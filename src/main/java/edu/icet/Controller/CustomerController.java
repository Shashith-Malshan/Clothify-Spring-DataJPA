package edu.icet.Controller;

import edu.icet.Service.CustomerService;
import edu.icet.model.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<CustomerDto> findById(@PathVariable String id){
        return customerService.findById(id);
    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable String id){
        customerService.deleteById(id);
        return "Successfully deleted";
    }

    @PutMapping("{id}")
    public String update(@PathVariable String id,@RequestBody CustomerDto customerDto){
        customerService.update(id,customerDto);
        return "Updated Successfully";
    }


}
