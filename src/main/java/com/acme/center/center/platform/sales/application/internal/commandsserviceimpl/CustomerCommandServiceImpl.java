package com.acme.center.center.platform.sales.application.internal.commandsserviceimpl;


import com.acme.center.center.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.center.center.platform.sales.application.commandservices.CustomerCommandServices;
import com.acme.center.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.center.platform.sales.domain.model.valueobjects.DeliveryCode;
import com.acme.center.center.platform.sales.domain.model.valueobjects.WarehouseId;
import com.acme.center.center.platform.sales.domain.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerCommandServiceImpl implements CustomerCommandServices {

    private final CustomerRepository repository;

    public CustomerCommandServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer handle(CreateCustomerCommand command) {
         if(command == null){
             throw new IllegalArgumentException("Command cannot be null");
         }
         var customer = new Customer(new DeliveryCode(command.DeliveryCode()),
                 new WarehouseId(command.warehouseId()));
         return repository.save(customer);
}
