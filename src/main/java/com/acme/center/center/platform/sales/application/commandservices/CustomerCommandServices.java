package com.acme.center.center.platform.sales.application.commandservices;

import com.acme.center.center.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.center.center.platform.sales.domain.model.aggregates.Customer;

public interface CustomerCommandServices {
    Customer handle(CreateCustomerCommand command);
}
