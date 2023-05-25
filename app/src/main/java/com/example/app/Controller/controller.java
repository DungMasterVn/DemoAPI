package com.example.app.Controller;

import com.example.app.Entity.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.app.Service.service;

import java.util.List;

@RestController
public class controller {
    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello guys!";
    }

    @Autowired
    service userservice;
    @GetMapping("getuser")
    public List<entity> getUser() {
        return userservice.getUser();
    }

    @PostMapping("saveuser")
    public entity saveuser (@RequestBody entity user){
        return userservice.saveuser(user);
    }
}
