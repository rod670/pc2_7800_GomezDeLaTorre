package com.acme.center.center.platform.sales.domain.model.valueobjects;

public record priorityLevel(Integer priorityLevel) {
    public priorityLevel {
        if (priorityLevel == null) {
            throw new IllegalArgumentException("Priority level cannot be null");
        }
        if (priorityLevel < 1 || priorityLevel > 5) {
            throw new IllegalArgumentException("Priority level cannot be less than 1 or greater than 5");
        }
    }
}
