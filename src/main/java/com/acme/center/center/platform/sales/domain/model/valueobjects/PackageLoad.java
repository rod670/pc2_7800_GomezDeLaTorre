package com.acme.center.center.platform.sales.domain.model.valueobjects;

public record PackageLoad(Integer quantity, String unit) {

    public PackageLoad {
        if (quantity == null || unit == null) {
            throw new IllegalArgumentException("Package load cannot be null");
        }
        if (quantity < 1){
            throw new IllegalArgumentException("Quantity cannot be negative or 0");
        }
    }
    public PackageLoadIncreaseBy(Integer additionalquantity) {
        if (additionalquantity == null || additionalquantity < 1 || additionalquantity > integer.Max_Value) {
            throw new IllegalArgumentException("Additional quantity cannot be null or less than 1");
        } else {
            return quantity + additionalquantity;
        }
    }

}
