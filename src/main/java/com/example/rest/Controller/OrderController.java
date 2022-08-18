package com.example.rest.Controller;

import com.example.rest.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    private OrderRepo orderRepo;
}
