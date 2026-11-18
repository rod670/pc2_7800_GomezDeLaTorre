package com.acme.center.center.platform.sales.application.commands;

import com.acme.center.center.platform.sales.domain.model.valueobjects.*;
import com.acme.center.center.platform.sales.domain.model.aggregates.*;

public record CreateCustomerCommand(
        Long id;
        String deliveryCode;
        String warehouseId;
        String deliveryWindowStartDate;
        String packageLoadUnit;
        Integer priorityLevel;
        String status;
        String deliveryNotes;
) {
}
