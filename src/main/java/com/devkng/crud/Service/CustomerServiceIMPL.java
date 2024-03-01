package com.devkng.crud.Service;

import com.devkng.crud.CustomerRepo.CustomerRepo;
import com.devkng.crud.DTO.CustomerSaveDTO;
import com.devkng.crud.entity.Customer;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    public CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
            customerSaveDTO.getCustomerName(),
            customerSaveDTO.getCustomeraddress(),
            customerSaveDTO.getMobile()
        );

        customerRepo.save(customer);
        return customer.getCustomerName();
    }

}
