package com.acme.center.center.platform.sales.domain.model.valueobjects;

public record DeliveryCode(DeliveryCode deliveryCode) {

    public DeliveryCode {
        if (deliveryCode == null || deliveryCode.isBlank()) {
            throw new IllegalArgumentException("Delivery code cannot be null");
        }

    }
}
