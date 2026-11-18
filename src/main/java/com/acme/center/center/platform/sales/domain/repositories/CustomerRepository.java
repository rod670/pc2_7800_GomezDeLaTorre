package com.acme.center.center.platform.sales.domain.repositories;

import com.acme.center.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.center.platform.sales.domain.model.valueobjects.DeliveryCode;
import org.hibernate.internal.util.Optional;

public interface CustomerRepository {
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    boolean existsById(Long id);
    Optional <Customer> findByDeliveryCode(DeliveryCode deliveryCode);
}
