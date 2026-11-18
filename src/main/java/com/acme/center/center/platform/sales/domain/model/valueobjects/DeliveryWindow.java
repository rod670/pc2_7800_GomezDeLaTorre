package com.acme.center.center.platform.sales.domain.model.valueobjects;

import java.time.LocalDate;

public record DeliveryWindow(LocalDate startDate, LocalDate endDate) {

    public DeliveryWindow {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Delivery window cannot be null");

        }
    }
}
