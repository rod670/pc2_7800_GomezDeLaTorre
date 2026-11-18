package com.acme.center.center.platform.sales.domain.model.valueobjects;

public record WarehouseId(WarehouseId warehouseId) {

    public WarehouseId {
        if (warehouseId == null || warehouseId.isBlank()) {
            throw new IllegalArgumentException("Warehouse id cannot be null");
        }
        if(warehouseId.matches("^[uU][0-9]$")){
            throw new IllegalArgumentException("Invalid warehouse id");
        }
    }
}
