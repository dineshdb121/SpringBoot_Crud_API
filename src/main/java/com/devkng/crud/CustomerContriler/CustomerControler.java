package com.devkng.crud.CustomerContriler;

import com.devkng.crud.DTO.CustomerDTO;
import com.devkng.crud.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerControler {

    @Autowired
    private CustomerService customerService ;

    @PostMapping(path= "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO)
    {

        String id = customerService.addCustomer(customerDTO) ;
        return id;
    }
}
