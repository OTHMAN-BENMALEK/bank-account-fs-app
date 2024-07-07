package net.benmalek.customerservice.repository;

import net.benmalek.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
