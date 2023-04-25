package com.example.swagger.controllers;


import com.example.swagger.models.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("/")
    public String home(){
        return "Greetings";
    }

    @GetMapping("some_inf")
    public Customer customer(){
        return new Customer("me_name", "me_surname", "me_lastname",
                "my_group", "and_my_email");
    }
}
