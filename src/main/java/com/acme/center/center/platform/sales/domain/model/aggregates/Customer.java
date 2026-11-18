package com.acme.center.center.platform.sales.domain.model.aggregates;

import com.acme.center.center.platform.sales.domain.model.valueobjects.DeliveryCode;
import com.acme.center.center.platform.sales.domain.model.valueobjects.WarehouseId;
import com.acme.center.center.platform.sales.domain.model.valueobjects.DeliveryWindow;
import com.acme.center.center.platform.sales.domain.model.valueobjects.PackageLoad;
import com.acme.center.center.platform.sales.domain.model.valueobjects.priorityLevel;

public class Customer {
    private Long id;
    private DeliveryCode deliveryCode;
    private WarehouseId warehouseId;
    private DeliveryWindow deliveryWindow;
    private PackageLoad packageLoad;
    private Integer priorityLevel;
    private DeliveryStatus status;
    private String deliveryNotes;
}
