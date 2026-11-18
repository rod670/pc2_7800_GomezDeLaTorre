package com.acme.center.center.platform.sales.application.commands;

import com.acme.center.center.platform.sales.domain.model.valueobjects.*;
import com.acme.center.center.platform.sales.domain.model.aggregates.*;

public record CreateCustomerCommand(
        Long id;
        DeliveryCode deliveryCode;
        WarehouseId warehouseId;
        DeliveryWindow deliveryWindow;
        PackageLoad packageLoad;
        Integer priorityLevel;
        DeliveryStatus status;
        String deliveryNotes;
) {
}
