package com.cartapi.cartapiemo;

import java.util.List;
import com.cartapi.cartapiemo.Entity.Item;
import com.cartapi.cartapiemo.Entity.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin
@RequestMapping("/shopping")
public class ShoppingController {
    @Autowired
    ShoppingRepository repository;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @PostMapping("/add")
    public String addItem(@RequestBody Item item) {
        // TODO: process POST request
        repository.insert(item);
        return "Added data in stock successfully";
    }

    @GetMapping("/get")
    public List<Item> getData() {
        return repository.findAll();
    }

}
