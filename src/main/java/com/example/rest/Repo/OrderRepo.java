package com.example.rest.Repo;

import com.example.rest.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
