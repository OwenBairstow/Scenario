package com.example.morrisons.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// repository for order

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {

}
